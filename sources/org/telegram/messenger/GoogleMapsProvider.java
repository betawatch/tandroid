package org.telegram.messenger;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class GoogleMapsProvider implements IMapsProvider {

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public static final class GoogleCameraUpdate implements IMapsProvider.ICameraUpdate {
        private i8.a cameraUpdate;

        private GoogleCameraUpdate(i8.a aVar) {
            this.cameraUpdate = aVar;
        }
    }

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public static final class GoogleCircleOptions implements IMapsProvider.ICircleOptions {
        private k8.b circleOptions;

        @Override // org.telegram.messenger.IMapsProvider.ICircleOptions
        public IMapsProvider.ICircleOptions center(IMapsProvider.LatLng latLng) {
            k8.b bVar = this.circleOptions;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            bVar.getClass();
            bVar.a = latLng2;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.ICircleOptions
        public IMapsProvider.ICircleOptions fillColor(int i10) {
            this.circleOptions.e = i10;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.ICircleOptions
        public IMapsProvider.ICircleOptions radius(double d) {
            this.circleOptions.b = d;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.ICircleOptions
        public IMapsProvider.ICircleOptions strokeColor(int i10) {
            this.circleOptions.d = i10;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.ICircleOptions
        public IMapsProvider.ICircleOptions strokePattern(List<IMapsProvider.PatternItem> list) {
            ArrayList arrayList = new ArrayList();
            for (IMapsProvider.PatternItem patternItem : list) {
                if (patternItem instanceof IMapsProvider.PatternItem.Gap) {
                    arrayList.add(new k8.c(((IMapsProvider.PatternItem.Gap) patternItem).length, 1));
                } else if (patternItem instanceof IMapsProvider.PatternItem.Dash) {
                    arrayList.add(new k8.c(((IMapsProvider.PatternItem.Dash) patternItem).length, 0));
                }
            }
            this.circleOptions.r = arrayList;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.ICircleOptions
        public IMapsProvider.ICircleOptions strokeWidth(int i10) {
            this.circleOptions.c = i10;
            return this;
        }

        private GoogleCircleOptions() {
            k8.b bVar = new k8.b();
            bVar.a = null;
            bVar.b = 0.0d;
            bVar.c = 10.0f;
            bVar.d = -16777216;
            bVar.e = 0;
            bVar.f = 0.0f;
            bVar.h = true;
            bVar.n = false;
            bVar.r = null;
            this.circleOptions = bVar;
        }
    }

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public static final class GoogleLatLngBounds implements IMapsProvider.ILatLngBounds {
        private LatLngBounds bounds;

        @Override // org.telegram.messenger.IMapsProvider.ILatLngBounds
        public IMapsProvider.LatLng getCenter() {
            LatLngBounds latLngBounds = this.bounds;
            LatLng latLng = latLngBounds.a;
            double d = latLng.a;
            LatLng latLng2 = latLngBounds.b;
            double d10 = (d + latLng2.a) / 2.0d;
            double d11 = latLng2.b;
            double d12 = latLng.b;
            if (d12 > d11) {
                d11 += 360.0d;
            }
            LatLng latLng3 = new LatLng(d10, (d11 + d12) / 2.0d);
            return new IMapsProvider.LatLng(latLng3.a, latLng3.b);
        }

        private GoogleLatLngBounds(LatLngBounds latLngBounds) {
            this.bounds = latLngBounds;
        }
    }

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public static final class GoogleLatLngBoundsBuilder implements IMapsProvider.ILatLngBoundsBuilder {
        private k8.d builder;

        @Override // org.telegram.messenger.IMapsProvider.ILatLngBoundsBuilder
        public IMapsProvider.ILatLngBounds build() {
            k8.d dVar = this.builder;
            o6.l.j("no included points", !Double.isNaN(dVar.c));
            return new GoogleLatLngBounds(new LatLngBounds(new LatLng(dVar.a, dVar.c), new LatLng(dVar.b, dVar.d)));
        }

        @Override // org.telegram.messenger.IMapsProvider.ILatLngBoundsBuilder
        public IMapsProvider.ILatLngBoundsBuilder include(IMapsProvider.LatLng latLng) {
            k8.d dVar = this.builder;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            dVar.getClass();
            double d = dVar.a;
            double d10 = latLng2.a;
            dVar.a = Math.min(d, d10);
            dVar.b = Math.max(dVar.b, d10);
            boolean isNaN = Double.isNaN(dVar.c);
            double d11 = latLng2.b;
            if (isNaN) {
                dVar.c = d11;
                dVar.d = d11;
                return this;
            }
            double d12 = dVar.c;
            double d13 = dVar.d;
            if (d12 > d13 ? !(d12 <= d11 || d11 <= d13) : !(d12 <= d11 && d11 <= d13)) {
                if (((d12 - d11) + 360.0d) % 360.0d < ((d11 - d13) + 360.0d) % 360.0d) {
                    dVar.c = d11;
                    return this;
                }
                dVar.d = d11;
            }
            return this;
        }

        private GoogleLatLngBoundsBuilder() {
            k8.d dVar = new k8.d();
            dVar.a = Double.POSITIVE_INFINITY;
            dVar.b = Double.NEGATIVE_INFINITY;
            dVar.c = Double.NaN;
            dVar.d = Double.NaN;
            this.builder = dVar;
        }
    }

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public static final class GoogleMapImpl implements IMapsProvider.IMap {
        private i8.c googleMap;
        private Map<k8.a, GoogleCircle> implToAbsCircleMap;
        private Map<k8.f, GoogleMarker> implToAbsMarkerMap;

        /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
        public final class GoogleCircle implements IMapsProvider.ICircle {
            private k8.a circle;

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public double getRadius() {
                k8.a aVar = this.circle;
                aVar.getClass();
                try {
                    t7.f fVar = (t7.f) aVar.a;
                    Parcel M0 = fVar.M0(fVar.N0(), 6);
                    double readDouble = M0.readDouble();
                    M0.recycle();
                    return readDouble;
                } catch (RemoteException e) {
                    throw new androidx.car.app.j(e);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public void remove() {
                k8.a aVar = this.circle;
                aVar.getClass();
                try {
                    t7.f fVar = (t7.f) aVar.a;
                    fVar.R0(fVar.N0(), 1);
                    GoogleMapImpl.this.implToAbsCircleMap.remove(this.circle);
                } catch (RemoteException e) {
                    throw new androidx.car.app.j(e);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public void setCenter(IMapsProvider.LatLng latLng) {
                k8.a aVar = this.circle;
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                aVar.getClass();
                try {
                    t7.f fVar = (t7.f) aVar.a;
                    Parcel N0 = fVar.N0();
                    t7.b.b(N0, latLng2);
                    fVar.R0(N0, 3);
                } catch (RemoteException e) {
                    throw new androidx.car.app.j(e);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public void setFillColor(int i10) {
                k8.a aVar = this.circle;
                aVar.getClass();
                try {
                    t7.f fVar = (t7.f) aVar.a;
                    Parcel N0 = fVar.N0();
                    N0.writeInt(i10);
                    fVar.R0(N0, 11);
                } catch (RemoteException e) {
                    throw new androidx.car.app.j(e);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public void setRadius(double d) {
                k8.a aVar = this.circle;
                aVar.getClass();
                try {
                    t7.f fVar = (t7.f) aVar.a;
                    Parcel N0 = fVar.N0();
                    N0.writeDouble(d);
                    fVar.R0(N0, 5);
                } catch (RemoteException e) {
                    throw new androidx.car.app.j(e);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public void setStrokeColor(int i10) {
                k8.a aVar = this.circle;
                aVar.getClass();
                try {
                    t7.f fVar = (t7.f) aVar.a;
                    Parcel N0 = fVar.N0();
                    N0.writeInt(i10);
                    fVar.R0(N0, 9);
                } catch (RemoteException e) {
                    throw new androidx.car.app.j(e);
                }
            }

            private GoogleCircle(k8.a aVar) {
                this.circle = aVar;
            }
        }

        /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
        public final class GoogleMarker implements IMapsProvider.IMarker {
            private k8.f marker;

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public IMapsProvider.LatLng getPosition() {
                k8.f fVar = this.marker;
                fVar.getClass();
                try {
                    t7.i iVar = (t7.i) fVar.a;
                    Parcel M0 = iVar.M0(iVar.N0(), 4);
                    Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
                    int i10 = t7.b.a;
                    LatLng createFromParcel = M0.readInt() == 0 ? null : creator.createFromParcel(M0);
                    M0.recycle();
                    return new IMapsProvider.LatLng(createFromParcel.a, createFromParcel.b);
                } catch (RemoteException e) {
                    throw new androidx.car.app.j(e);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public Object getTag() {
                k8.f fVar = this.marker;
                fVar.getClass();
                try {
                    t7.i iVar = (t7.i) fVar.a;
                    Parcel M0 = iVar.M0(iVar.N0(), 30);
                    y6.a K0 = y6.b.K0(M0.readStrongBinder());
                    M0.recycle();
                    return y6.b.L0(K0);
                } catch (RemoteException e) {
                    throw new androidx.car.app.j(e);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void remove() {
                k8.f fVar = this.marker;
                fVar.getClass();
                try {
                    t7.i iVar = (t7.i) fVar.a;
                    iVar.R0(iVar.N0(), 1);
                    GoogleMapImpl.this.implToAbsMarkerMap.remove(this.marker);
                } catch (RemoteException e) {
                    throw new androidx.car.app.j(e);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void setIcon(Bitmap bitmap) {
                this.marker.a(a8.od.a(bitmap));
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void setPosition(IMapsProvider.LatLng latLng) {
                k8.f fVar = this.marker;
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                fVar.getClass();
                try {
                    t7.i iVar = (t7.i) fVar.a;
                    Parcel N0 = iVar.N0();
                    t7.b.b(N0, latLng2);
                    iVar.R0(N0, 3);
                } catch (RemoteException e) {
                    throw new androidx.car.app.j(e);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void setRotation(int i10) {
                k8.f fVar = this.marker;
                float f7 = i10;
                fVar.getClass();
                try {
                    t7.i iVar = (t7.i) fVar.a;
                    Parcel N0 = iVar.N0();
                    N0.writeFloat(f7);
                    iVar.R0(N0, 22);
                } catch (RemoteException e) {
                    throw new androidx.car.app.j(e);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void setTag(Object obj) {
                k8.f fVar = this.marker;
                fVar.getClass();
                try {
                    t7.a aVar = fVar.a;
                    y6.b bVar = new y6.b(obj);
                    t7.i iVar = (t7.i) aVar;
                    Parcel N0 = iVar.N0();
                    t7.b.c(N0, bVar);
                    iVar.R0(N0, 29);
                } catch (RemoteException e) {
                    throw new androidx.car.app.j(e);
                }
            }

            private GoogleMarker(k8.f fVar) {
                this.marker = fVar;
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void setIcon(int i10) {
                this.marker.a(a8.od.b(i10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$setOnCameraMoveStartedListener$0(IMapsProvider.OnCameraMoveStartedListener onCameraMoveStartedListener, int i10) {
            int i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 1;
                }
            }
            onCameraMoveStartedListener.onCameraMoveStarted(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$setOnMarkerClickListener$1(IMapsProvider.OnMarkerClickListener onMarkerClickListener, k8.f fVar) {
            GoogleMarker googleMarker = this.implToAbsMarkerMap.get(fVar);
            if (googleMarker == null) {
                googleMarker = new GoogleMarker(fVar);
                this.implToAbsMarkerMap.put(fVar, googleMarker);
            }
            return onMarkerClickListener.onClick(googleMarker);
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public IMapsProvider.ICircle addCircle(IMapsProvider.ICircleOptions iCircleOptions) {
            t7.h fVar;
            i8.c cVar = this.googleMap;
            k8.b bVar = ((GoogleCircleOptions) iCircleOptions).circleOptions;
            cVar.getClass();
            try {
                o6.l.i(bVar, "CircleOptions must not be null.");
                j8.f fVar2 = cVar.a;
                Parcel N0 = fVar2.N0();
                t7.b.b(N0, bVar);
                Parcel M0 = fVar2.M0(N0, 35);
                IBinder readStrongBinder = M0.readStrongBinder();
                int i10 = t7.g.b;
                if (readStrongBinder == null) {
                    fVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    fVar = queryLocalInterface instanceof t7.h ? (t7.h) queryLocalInterface : new t7.f(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 10);
                }
                M0.recycle();
                k8.a aVar = new k8.a(fVar);
                GoogleCircle googleCircle = new GoogleCircle(aVar);
                this.implToAbsCircleMap.put(aVar, googleCircle);
                return googleCircle;
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public IMapsProvider.IMarker addMarker(IMapsProvider.IMarkerOptions iMarkerOptions) {
            t7.a iVar;
            i8.c cVar = this.googleMap;
            k8.g gVar = ((GoogleMarkerOptions) iMarkerOptions).markerOptions;
            cVar.getClass();
            try {
                o6.l.i(gVar, "MarkerOptions must not be null.");
                j8.f fVar = cVar.a;
                Parcel N0 = fVar.N0();
                t7.b.b(N0, gVar);
                Parcel M0 = fVar.M0(N0, 11);
                IBinder readStrongBinder = M0.readStrongBinder();
                int i10 = t7.j.b;
                if (readStrongBinder == null) {
                    iVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    iVar = queryLocalInterface instanceof t7.a ? (t7.a) queryLocalInterface : new t7.i(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 10);
                }
                M0.recycle();
                k8.f fVar2 = iVar != null ? new k8.f(iVar) : null;
                GoogleMarker googleMarker = new GoogleMarker(fVar2);
                this.implToAbsMarkerMap.put(fVar2, googleMarker);
                return googleMarker;
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate) {
            i8.c cVar = this.googleMap;
            i8.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            cVar.getClass();
            try {
                o6.l.i(aVar, "CameraUpdate must not be null.");
                j8.f fVar = cVar.a;
                y6.a aVar2 = aVar.a;
                Parcel N0 = fVar.N0();
                t7.b.c(N0, aVar2);
                fVar.R0(N0, 5);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public IMapsProvider.CameraPosition getCameraPosition() {
            i8.c cVar = this.googleMap;
            cVar.getClass();
            try {
                j8.f fVar = cVar.a;
                Parcel M0 = fVar.M0(fVar.N0(), 1);
                Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
                int i10 = t7.b.a;
                CameraPosition createFromParcel = M0.readInt() == 0 ? null : creator.createFromParcel(M0);
                M0.recycle();
                LatLng latLng = createFromParcel.a;
                return new IMapsProvider.CameraPosition(new IMapsProvider.LatLng(latLng.a, latLng.b), createFromParcel.b);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public float getMaxZoomLevel() {
            i8.c cVar = this.googleMap;
            cVar.getClass();
            try {
                j8.f fVar = cVar.a;
                Parcel M0 = fVar.M0(fVar.N0(), 2);
                float readFloat = M0.readFloat();
                M0.recycle();
                return readFloat;
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public float getMinZoomLevel() {
            i8.c cVar = this.googleMap;
            cVar.getClass();
            try {
                j8.f fVar = cVar.a;
                Parcel M0 = fVar.M0(fVar.N0(), 3);
                float readFloat = M0.readFloat();
                M0.recycle();
                return readFloat;
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public IMapsProvider.IProjection getProjection() {
            j8.b bVar;
            i8.c cVar = this.googleMap;
            cVar.getClass();
            try {
                j8.f fVar = cVar.a;
                Parcel M0 = fVar.M0(fVar.N0(), 26);
                IBinder readStrongBinder = M0.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    bVar = queryLocalInterface instanceof j8.b ? (j8.b) queryLocalInterface : new j8.b(readStrongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate", 10);
                }
                M0.recycle();
                return new GoogleProjection(new i8.g(bVar));
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public IMapsProvider.IUISettings getUiSettings() {
            j8.c cVar;
            i8.c cVar2 = this.googleMap;
            cVar2.getClass();
            try {
                if (cVar2.b == null) {
                    j8.f fVar = cVar2.a;
                    Parcel M0 = fVar.M0(fVar.N0(), 25);
                    IBinder readStrongBinder = M0.readStrongBinder();
                    if (readStrongBinder == null) {
                        cVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        cVar = queryLocalInterface instanceof j8.c ? (j8.c) queryLocalInterface : new j8.c(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 10);
                    }
                    M0.recycle();
                    cVar2.b = new i8.h(cVar);
                }
                return new GoogleUISettings(cVar2.b);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void moveCamera(IMapsProvider.ICameraUpdate iCameraUpdate) {
            i8.c cVar = this.googleMap;
            i8.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            cVar.getClass();
            try {
                o6.l.i(aVar, "CameraUpdate must not be null.");
                j8.f fVar = cVar.a;
                y6.a aVar2 = aVar.a;
                Parcel N0 = fVar.N0();
                t7.b.c(N0, aVar2);
                fVar.R0(N0, 4);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setMapStyle(IMapsProvider.IMapStyleOptions iMapStyleOptions) {
            i8.c cVar = this.googleMap;
            k8.e eVar = iMapStyleOptions == null ? null : ((GoogleMapStyleOptions) iMapStyleOptions).mapStyleOptions;
            cVar.getClass();
            try {
                j8.f fVar = cVar.a;
                Parcel N0 = fVar.N0();
                t7.b.b(N0, eVar);
                Parcel M0 = fVar.M0(N0, 91);
                M0.readInt();
                M0.recycle();
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setMapType(int i10) {
            if (i10 == 0) {
                this.googleMap.a(1);
            } else if (i10 == 1) {
                this.googleMap.a(2);
            } else {
                if (i10 != 2) {
                    return;
                }
                this.googleMap.a(4);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setMyLocationEnabled(boolean z10) {
            i8.c cVar = this.googleMap;
            cVar.getClass();
            try {
                j8.f fVar = cVar.a;
                Parcel N0 = fVar.N0();
                int i10 = t7.b.a;
                N0.writeInt(z10 ? 1 : 0);
                fVar.R0(N0, 22);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnCameraIdleListener(Runnable runnable) {
            i8.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            o4 o4Var = new o4(runnable);
            j8.f fVar = cVar.a;
            try {
                i8.i iVar = new i8.i(o4Var, (char) 0);
                Parcel N0 = fVar.N0();
                t7.b.c(N0, iVar);
                fVar.R0(N0, 99);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnCameraMoveListener(Runnable runnable) {
            i8.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            o4 o4Var = new o4(runnable);
            j8.f fVar = cVar.a;
            try {
                i8.i iVar = new i8.i(o4Var);
                Parcel N0 = fVar.N0();
                t7.b.c(N0, iVar);
                fVar.R0(N0, 97);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnCameraMoveStartedListener(IMapsProvider.OnCameraMoveStartedListener onCameraMoveStartedListener) {
            i8.c cVar = this.googleMap;
            g0 g0Var = new g0(onCameraMoveStartedListener, 4);
            j8.f fVar = cVar.a;
            try {
                i8.i iVar = new i8.i(g0Var);
                Parcel N0 = fVar.N0();
                t7.b.c(N0, iVar);
                fVar.R0(N0, 96);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnMapLoadedCallback(Runnable runnable) {
            i8.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            o4 o4Var = new o4(runnable);
            j8.f fVar = cVar.a;
            try {
                i8.i iVar = new i8.i(o4Var, (byte) 0);
                Parcel N0 = fVar.N0();
                t7.b.c(N0, iVar);
                fVar.R0(N0, 42);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnMarkerClickListener(IMapsProvider.OnMarkerClickListener onMarkerClickListener) {
            i8.c cVar = this.googleMap;
            f fVar = new f(3, this, onMarkerClickListener);
            j8.f fVar2 = cVar.a;
            try {
                i8.i iVar = new i8.i(fVar);
                Parcel N0 = fVar2.N0();
                t7.b.c(N0, iVar);
                fVar2.R0(N0, 30);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnMyLocationChangeListener(q0.a aVar) {
            i8.c cVar = this.googleMap;
            Objects.requireNonNull(aVar);
            n4 n4Var = new n4(aVar, 2);
            j8.f fVar = cVar.a;
            try {
                i8.i iVar = new i8.i(n4Var);
                Parcel N0 = fVar.N0();
                t7.b.c(N0, iVar);
                fVar.R0(N0, 36);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setPadding(int i10, int i11, int i12, int i13) {
            i8.c cVar = this.googleMap;
            cVar.getClass();
            try {
                j8.f fVar = cVar.a;
                Parcel N0 = fVar.N0();
                N0.writeInt(i10);
                N0.writeInt(i11);
                N0.writeInt(i12);
                N0.writeInt(i13);
                fVar.R0(N0, 39);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        private GoogleMapImpl(i8.c cVar) {
            this.implToAbsMarkerMap = new HashMap();
            this.implToAbsCircleMap = new HashMap();
            this.googleMap = cVar;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate, final IMapsProvider.ICancelableCallback iCancelableCallback) {
            i8.c cVar = this.googleMap;
            i8.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            i8.i iVar = null;
            i8.b bVar = iCancelableCallback == null ? null : new i8.b() { // from class: org.telegram.messenger.GoogleMapsProvider.GoogleMapImpl.1
                @Override // i8.b
                public void onCancel() {
                    iCancelableCallback.onCancel();
                }

                @Override // i8.b
                public void onFinish() {
                    iCancelableCallback.onFinish();
                }
            };
            cVar.getClass();
            try {
                o6.l.i(aVar, "CameraUpdate must not be null.");
                j8.f fVar = cVar.a;
                y6.a aVar2 = aVar.a;
                if (bVar != null) {
                    iVar = new i8.i(bVar);
                }
                Parcel N0 = fVar.N0();
                t7.b.c(N0, aVar2);
                t7.b.c(N0, iVar);
                fVar.R0(N0, 6);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate, int i10, final IMapsProvider.ICancelableCallback iCancelableCallback) {
            i8.c cVar = this.googleMap;
            i8.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            i8.i iVar = null;
            i8.b bVar = iCancelableCallback == null ? null : new i8.b() { // from class: org.telegram.messenger.GoogleMapsProvider.GoogleMapImpl.2
                @Override // i8.b
                public void onCancel() {
                    iCancelableCallback.onCancel();
                }

                @Override // i8.b
                public void onFinish() {
                    iCancelableCallback.onFinish();
                }
            };
            cVar.getClass();
            try {
                o6.l.i(aVar, "CameraUpdate must not be null.");
                j8.f fVar = cVar.a;
                y6.a aVar2 = aVar.a;
                if (bVar != null) {
                    iVar = new i8.i(bVar);
                }
                Parcel N0 = fVar.N0();
                t7.b.c(N0, aVar2);
                N0.writeInt(i10);
                t7.b.c(N0, iVar);
                fVar.R0(N0, 7);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }
    }

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public static final class GoogleMapStyleOptions implements IMapsProvider.IMapStyleOptions {
        private k8.e mapStyleOptions;

        private GoogleMapStyleOptions(k8.e eVar) {
            this.mapStyleOptions = eVar;
        }
    }

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public static final class GoogleMapView implements IMapsProvider.IMapView {
        private IMapsProvider.ITouchInterceptor dispatchInterceptor;
        private GLSurfaceView glSurfaceView;
        private IMapsProvider.ITouchInterceptor interceptInterceptor;
        private i8.d mapView;
        private Runnable onLayoutListener;

        /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
        public class 1 extends i8.d {
            public 1(Context context) {
                super(context);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ Boolean lambda$dispatchTouchEvent$0(MotionEvent motionEvent) {
                return Boolean.valueOf(super.dispatchTouchEvent(motionEvent));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ Boolean lambda$onInterceptTouchEvent$1(MotionEvent motionEvent) {
                return Boolean.valueOf(super.onInterceptTouchEvent(motionEvent));
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return GoogleMapView.this.dispatchInterceptor != null ? GoogleMapView.this.dispatchInterceptor.onInterceptTouchEvent(motionEvent, new q4(this, 0)) : super.dispatchTouchEvent(motionEvent);
            }

            @Override // android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return GoogleMapView.this.interceptInterceptor != null ? GoogleMapView.this.interceptInterceptor.onInterceptTouchEvent(motionEvent, new q4(this, 1)) : super.onInterceptTouchEvent(motionEvent);
            }

            @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
                super.onLayout(z10, i10, i11, i12, i13);
                if (GoogleMapView.this.onLayoutListener != null) {
                    GoogleMapView.this.onLayoutListener.run();
                }
            }
        }

        private void findGlSurfaceView(View view) {
            if (view instanceof GLSurfaceView) {
                this.glSurfaceView = (GLSurfaceView) view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    findGlSurfaceView(viewGroup.getChildAt(i10));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$getMapAsync$0(q0.a aVar, i8.c cVar) {
            aVar.accept(new GoogleMapImpl(cVar));
            findGlSurfaceView(this.mapView);
        }

        @Override // org.telegram.messenger.IMapsProvider.IMapView
        public GLSurfaceView getGlSurfaceView() {
            return this.glSurfaceView;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMapView
        public void getMapAsync(q0.a aVar) {
            this.mapView.getMapAsync(new p4(this, aVar));
        }

        @Override // org.telegram.messenger.IMapsProvider.IMapView
        public View getView() {
            return this.mapView;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMapView
        public void onCreate(Bundle bundle) {
            this.mapView.onCreate(bundle);
        }

        @Override // org.telegram.messenger.IMapsProvider.IMapView
        public void onDestroy() {
            this.mapView.onDestroy();
        }

        @Override // org.telegram.messenger.IMapsProvider.IMapView
        public void onLowMemory() {
            this.mapView.onLowMemory();
        }

        @Override // org.telegram.messenger.IMapsProvider.IMapView
        public void onPause() {
            this.mapView.onPause();
        }

        @Override // org.telegram.messenger.IMapsProvider.IMapView
        public void onResume() {
            this.mapView.onResume();
        }

        @Override // org.telegram.messenger.IMapsProvider.IMapView
        public void setOnDispatchTouchEventInterceptor(IMapsProvider.ITouchInterceptor iTouchInterceptor) {
            this.dispatchInterceptor = iTouchInterceptor;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMapView
        public void setOnInterceptTouchEventInterceptor(IMapsProvider.ITouchInterceptor iTouchInterceptor) {
            this.interceptInterceptor = iTouchInterceptor;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMapView
        public void setOnLayoutListener(Runnable runnable) {
            this.onLayoutListener = runnable;
        }

        private GoogleMapView(Context context) {
            this.mapView = new 1(context);
        }
    }

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public static final class GoogleMarkerOptions implements IMapsProvider.IMarkerOptions {
        private k8.g markerOptions;

        @Override // org.telegram.messenger.IMapsProvider.IMarkerOptions
        public IMapsProvider.IMarkerOptions anchor(float f7, float f10) {
            k8.g gVar = this.markerOptions;
            gVar.e = f7;
            gVar.f = f10;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMarkerOptions
        public IMapsProvider.IMarkerOptions flat(boolean z10) {
            this.markerOptions.r = z10;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMarkerOptions
        public IMapsProvider.IMarkerOptions icon(Bitmap bitmap) {
            this.markerOptions.d = a8.od.a(bitmap);
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMarkerOptions
        public IMapsProvider.IMarkerOptions position(IMapsProvider.LatLng latLng) {
            this.markerOptions.a = new LatLng(latLng.latitude, latLng.longitude);
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMarkerOptions
        public IMapsProvider.IMarkerOptions snippet(String str) {
            this.markerOptions.c = str;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMarkerOptions
        public IMapsProvider.IMarkerOptions title(String str) {
            this.markerOptions.b = str;
            return this;
        }

        private GoogleMarkerOptions() {
            k8.g gVar = new k8.g();
            gVar.e = 0.5f;
            gVar.f = 1.0f;
            gVar.n = true;
            gVar.r = false;
            gVar.s = 0.0f;
            gVar.v = 0.5f;
            gVar.w = 0.0f;
            gVar.x = 1.0f;
            this.markerOptions = gVar;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMarkerOptions
        public IMapsProvider.IMarkerOptions icon(int i10) {
            this.markerOptions.d = a8.od.b(i10);
            return this;
        }
    }

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public static final class GoogleProjection implements IMapsProvider.IProjection {
        private i8.g projection;

        @Override // org.telegram.messenger.IMapsProvider.IProjection
        public Point toScreenLocation(IMapsProvider.LatLng latLng) {
            i8.g gVar = this.projection;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            gVar.getClass();
            try {
                j8.b bVar = gVar.a;
                Parcel N0 = bVar.N0();
                t7.b.b(N0, latLng2);
                Parcel M0 = bVar.M0(N0, 2);
                y6.a K0 = y6.b.K0(M0.readStrongBinder());
                M0.recycle();
                return (Point) y6.b.L0(K0);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        private GoogleProjection(i8.g gVar) {
            this.projection = gVar;
        }
    }

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public static final class GoogleUISettings implements IMapsProvider.IUISettings {
        private i8.h uiSettings;

        @Override // org.telegram.messenger.IMapsProvider.IUISettings
        public void setCompassEnabled(boolean z10) {
            i8.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                j8.c cVar = hVar.a;
                Parcel N0 = cVar.N0();
                int i10 = t7.b.a;
                N0.writeInt(z10 ? 1 : 0);
                cVar.R0(N0, 2);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IUISettings
        public void setMyLocationButtonEnabled(boolean z10) {
            i8.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                j8.c cVar = hVar.a;
                Parcel N0 = cVar.N0();
                int i10 = t7.b.a;
                N0.writeInt(z10 ? 1 : 0);
                cVar.R0(N0, 3);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IUISettings
        public void setZoomControlsEnabled(boolean z10) {
            i8.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                j8.c cVar = hVar.a;
                Parcel N0 = cVar.N0();
                int i10 = t7.b.a;
                N0.writeInt(z10 ? 1 : 0);
                cVar.R0(N0, 1);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }

        private GoogleUISettings(i8.h hVar) {
            this.uiSettings = hVar;
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public int getInstallMapsString() {
        return R.string.InstallGoogleMaps;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public String getMapsAppPackageName() {
        return "com.google.android.apps.maps";
    }

    @Override // org.telegram.messenger.IMapsProvider
    public void initializeMaps(Context context) {
        synchronized (i8.e.class) {
            i8.e.c(context);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public IMapsProvider.IMapStyleOptions loadRawResourceStyle(Context context, int i10) {
        InputStream openRawResource = context.getResources().openRawResource(i10);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int read = openRawResource.read(bArr, 0, 1024);
                    if (read == -1) {
                        v6.b.a(openRawResource);
                        v6.b.a(byteArrayOutputStream);
                        return new GoogleMapStyleOptions(new k8.e(new String(byteArrayOutputStream.toByteArray(), "UTF-8")));
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th2) {
                    v6.b.a(openRawResource);
                    v6.b.a(byteArrayOutputStream);
                    throw th2;
                }
            }
        } catch (IOException e) {
            throw new Resources.NotFoundException("Failed to read resource " + i10 + ": " + e.toString());
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLng(IMapsProvider.LatLng latLng) {
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        try {
            j8.a aVar = a8.vc.a;
            o6.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel N0 = aVar.N0();
            t7.b.b(N0, latLng2);
            Parcel M0 = aVar.M0(N0, 8);
            y6.a K0 = y6.b.K0(M0.readStrongBinder());
            M0.recycle();
            return new GoogleCameraUpdate(new i8.a(K0));
        } catch (RemoteException e) {
            throw new androidx.car.app.j(e);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds(IMapsProvider.ILatLngBounds iLatLngBounds, int i10) {
        LatLngBounds latLngBounds = ((GoogleLatLngBounds) iLatLngBounds).bounds;
        o6.l.i(latLngBounds, "bounds must not be null");
        try {
            j8.a aVar = a8.vc.a;
            o6.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel N0 = aVar.N0();
            t7.b.b(N0, latLngBounds);
            N0.writeInt(i10);
            Parcel M0 = aVar.M0(N0, 10);
            y6.a K0 = y6.b.K0(M0.readStrongBinder());
            M0.recycle();
            return new GoogleCameraUpdate(new i8.a(K0));
        } catch (RemoteException e) {
            throw new androidx.car.app.j(e);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom(IMapsProvider.LatLng latLng, float f7) {
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        try {
            j8.a aVar = a8.vc.a;
            o6.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel N0 = aVar.N0();
            t7.b.b(N0, latLng2);
            N0.writeFloat(f7);
            Parcel M0 = aVar.M0(N0, 9);
            y6.a K0 = y6.b.K0(M0.readStrongBinder());
            M0.recycle();
            return new GoogleCameraUpdate(new i8.a(K0));
        } catch (RemoteException e) {
            throw new androidx.car.app.j(e);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public IMapsProvider.ICircleOptions onCreateCircleOptions() {
        return new GoogleCircleOptions();
    }

    @Override // org.telegram.messenger.IMapsProvider
    public IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder() {
        return new GoogleLatLngBoundsBuilder();
    }

    @Override // org.telegram.messenger.IMapsProvider
    public IMapsProvider.IMapView onCreateMapView(Context context) {
        return new GoogleMapView(context);
    }

    @Override // org.telegram.messenger.IMapsProvider
    public IMapsProvider.IMarkerOptions onCreateMarkerOptions() {
        return new GoogleMarkerOptions();
    }
}
