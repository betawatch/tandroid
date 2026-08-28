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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class GoogleMapsProvider implements IMapsProvider {

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static final class GoogleCameraUpdate implements IMapsProvider.ICameraUpdate {
        private r7.a cameraUpdate;

        private GoogleCameraUpdate(r7.a aVar) {
            this.cameraUpdate = aVar;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static final class GoogleCircleOptions implements IMapsProvider.ICircleOptions {
        private t7.b circleOptions;

        @Override // org.telegram.messenger.IMapsProvider.ICircleOptions
        public IMapsProvider.ICircleOptions center(IMapsProvider.LatLng latLng) {
            t7.b bVar = this.circleOptions;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            bVar.getClass();
            bVar.a = latLng2;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.ICircleOptions
        public IMapsProvider.ICircleOptions fillColor(int i9) {
            this.circleOptions.e = i9;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.ICircleOptions
        public IMapsProvider.ICircleOptions radius(double d) {
            this.circleOptions.b = d;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.ICircleOptions
        public IMapsProvider.ICircleOptions strokeColor(int i9) {
            this.circleOptions.d = i9;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.ICircleOptions
        public IMapsProvider.ICircleOptions strokePattern(List<IMapsProvider.PatternItem> list) {
            ArrayList arrayList = new ArrayList();
            for (IMapsProvider.PatternItem patternItem : list) {
                if (patternItem instanceof IMapsProvider.PatternItem.Gap) {
                    arrayList.add(new t7.c(((IMapsProvider.PatternItem.Gap) patternItem).length, 1));
                } else if (patternItem instanceof IMapsProvider.PatternItem.Dash) {
                    arrayList.add(new t7.c(((IMapsProvider.PatternItem.Dash) patternItem).length, 0));
                }
            }
            this.circleOptions.r = arrayList;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.ICircleOptions
        public IMapsProvider.ICircleOptions strokeWidth(int i9) {
            this.circleOptions.c = i9;
            return this;
        }

        private GoogleCircleOptions() {
            t7.b bVar = new t7.b();
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

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static final class GoogleLatLngBounds implements IMapsProvider.ILatLngBounds {
        private LatLngBounds bounds;

        @Override // org.telegram.messenger.IMapsProvider.ILatLngBounds
        public IMapsProvider.LatLng getCenter() {
            LatLngBounds latLngBounds = this.bounds;
            LatLng latLng = latLngBounds.a;
            double d = latLng.a;
            LatLng latLng2 = latLngBounds.b;
            double d9 = (d + latLng2.a) / 2.0d;
            double d10 = latLng2.b;
            double d11 = latLng.b;
            if (d11 > d10) {
                d10 += 360.0d;
            }
            LatLng latLng3 = new LatLng(d9, (d10 + d11) / 2.0d);
            return new IMapsProvider.LatLng(latLng3.a, latLng3.b);
        }

        private GoogleLatLngBounds(LatLngBounds latLngBounds) {
            this.bounds = latLngBounds;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static final class GoogleLatLngBoundsBuilder implements IMapsProvider.ILatLngBoundsBuilder {
        private t7.d builder;

        @Override // org.telegram.messenger.IMapsProvider.ILatLngBoundsBuilder
        public IMapsProvider.ILatLngBounds build() {
            t7.d dVar = this.builder;
            x5.l.j("no included points", !Double.isNaN(dVar.c));
            return new GoogleLatLngBounds(new LatLngBounds(new LatLng(dVar.a, dVar.c), new LatLng(dVar.b, dVar.d)));
        }

        @Override // org.telegram.messenger.IMapsProvider.ILatLngBoundsBuilder
        public IMapsProvider.ILatLngBoundsBuilder include(IMapsProvider.LatLng latLng) {
            t7.d dVar = this.builder;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            dVar.getClass();
            double d = dVar.a;
            double d9 = latLng2.a;
            dVar.a = Math.min(d, d9);
            dVar.b = Math.max(dVar.b, d9);
            boolean isNaN = Double.isNaN(dVar.c);
            double d10 = latLng2.b;
            if (isNaN) {
                dVar.c = d10;
                dVar.d = d10;
                return this;
            }
            double d11 = dVar.c;
            double d12 = dVar.d;
            if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
                if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                    dVar.c = d10;
                    return this;
                }
                dVar.d = d10;
            }
            return this;
        }

        private GoogleLatLngBoundsBuilder() {
            t7.d dVar = new t7.d();
            dVar.a = Double.POSITIVE_INFINITY;
            dVar.b = Double.NEGATIVE_INFINITY;
            dVar.c = Double.NaN;
            dVar.d = Double.NaN;
            this.builder = dVar;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static final class GoogleMapImpl implements IMapsProvider.IMap {
        private r7.c googleMap;
        private Map<t7.a, GoogleCircle> implToAbsCircleMap;
        private Map<t7.f, GoogleMarker> implToAbsMarkerMap;

        /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
        public final class GoogleCircle implements IMapsProvider.ICircle {
            private t7.a circle;

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public double getRadius() {
                t7.a aVar = this.circle;
                aVar.getClass();
                try {
                    c7.f fVar = (c7.f) aVar.a;
                    Parcel L0 = fVar.L0(fVar.M0(), 6);
                    double readDouble = L0.readDouble();
                    L0.recycle();
                    return readDouble;
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public void remove() {
                t7.a aVar = this.circle;
                aVar.getClass();
                try {
                    c7.f fVar = (c7.f) aVar.a;
                    fVar.Q0(fVar.M0(), 1);
                    GoogleMapImpl.this.implToAbsCircleMap.remove(this.circle);
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public void setCenter(IMapsProvider.LatLng latLng) {
                t7.a aVar = this.circle;
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                aVar.getClass();
                try {
                    c7.f fVar = (c7.f) aVar.a;
                    Parcel M0 = fVar.M0();
                    c7.b.b(M0, latLng2);
                    fVar.Q0(M0, 3);
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public void setFillColor(int i9) {
                t7.a aVar = this.circle;
                aVar.getClass();
                try {
                    c7.f fVar = (c7.f) aVar.a;
                    Parcel M0 = fVar.M0();
                    M0.writeInt(i9);
                    fVar.Q0(M0, 11);
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public void setRadius(double d) {
                t7.a aVar = this.circle;
                aVar.getClass();
                try {
                    c7.f fVar = (c7.f) aVar.a;
                    Parcel M0 = fVar.M0();
                    M0.writeDouble(d);
                    fVar.Q0(M0, 5);
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public void setStrokeColor(int i9) {
                t7.a aVar = this.circle;
                aVar.getClass();
                try {
                    c7.f fVar = (c7.f) aVar.a;
                    Parcel M0 = fVar.M0();
                    M0.writeInt(i9);
                    fVar.Q0(M0, 9);
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
                }
            }

            private GoogleCircle(t7.a aVar) {
                this.circle = aVar;
            }
        }

        /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
        public final class GoogleMarker implements IMapsProvider.IMarker {
            private t7.f marker;

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public IMapsProvider.LatLng getPosition() {
                t7.f fVar = this.marker;
                fVar.getClass();
                try {
                    c7.i iVar = (c7.i) fVar.a;
                    Parcel L0 = iVar.L0(iVar.M0(), 4);
                    Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
                    int i9 = c7.b.a;
                    LatLng createFromParcel = L0.readInt() == 0 ? null : creator.createFromParcel(L0);
                    L0.recycle();
                    return new IMapsProvider.LatLng(createFromParcel.a, createFromParcel.b);
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public Object getTag() {
                t7.f fVar = this.marker;
                fVar.getClass();
                try {
                    c7.i iVar = (c7.i) fVar.a;
                    Parcel L0 = iVar.L0(iVar.M0(), 30);
                    h6.a J0 = h6.b.J0(L0.readStrongBinder());
                    L0.recycle();
                    return h6.b.K0(J0);
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void remove() {
                t7.f fVar = this.marker;
                fVar.getClass();
                try {
                    c7.i iVar = (c7.i) fVar.a;
                    iVar.Q0(iVar.M0(), 1);
                    GoogleMapImpl.this.implToAbsMarkerMap.remove(this.marker);
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void setIcon(Bitmap bitmap) {
                this.marker.a(g7.m7.a(bitmap));
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void setPosition(IMapsProvider.LatLng latLng) {
                t7.f fVar = this.marker;
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                fVar.getClass();
                try {
                    c7.i iVar = (c7.i) fVar.a;
                    Parcel M0 = iVar.M0();
                    c7.b.b(M0, latLng2);
                    iVar.Q0(M0, 3);
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void setRotation(int i9) {
                t7.f fVar = this.marker;
                float f10 = i9;
                fVar.getClass();
                try {
                    c7.i iVar = (c7.i) fVar.a;
                    Parcel M0 = iVar.M0();
                    M0.writeFloat(f10);
                    iVar.Q0(M0, 22);
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void setTag(Object obj) {
                t7.f fVar = this.marker;
                fVar.getClass();
                try {
                    c7.a aVar = fVar.a;
                    h6.b bVar = new h6.b(obj);
                    c7.i iVar = (c7.i) aVar;
                    Parcel M0 = iVar.M0();
                    c7.b.c(M0, bVar);
                    iVar.Q0(M0, 29);
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
                }
            }

            private GoogleMarker(t7.f fVar) {
                this.marker = fVar;
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void setIcon(int i9) {
                this.marker.a(g7.m7.b(i9));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$setOnCameraMoveStartedListener$0(IMapsProvider.OnCameraMoveStartedListener onCameraMoveStartedListener, int i9) {
            int i10 = 2;
            if (i9 != 2) {
                i10 = 3;
                if (i9 != 3) {
                    i10 = 1;
                }
            }
            onCameraMoveStartedListener.onCameraMoveStarted(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$setOnMarkerClickListener$1(IMapsProvider.OnMarkerClickListener onMarkerClickListener, t7.f fVar) {
            GoogleMarker googleMarker = this.implToAbsMarkerMap.get(fVar);
            if (googleMarker == null) {
                googleMarker = new GoogleMarker(fVar);
                this.implToAbsMarkerMap.put(fVar, googleMarker);
            }
            return onMarkerClickListener.onClick(googleMarker);
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public IMapsProvider.ICircle addCircle(IMapsProvider.ICircleOptions iCircleOptions) {
            c7.h fVar;
            r7.c cVar = this.googleMap;
            t7.b bVar = ((GoogleCircleOptions) iCircleOptions).circleOptions;
            cVar.getClass();
            try {
                x5.l.i(bVar, "CircleOptions must not be null.");
                s7.f fVar2 = cVar.a;
                Parcel M0 = fVar2.M0();
                c7.b.b(M0, bVar);
                Parcel L0 = fVar2.L0(M0, 35);
                IBinder readStrongBinder = L0.readStrongBinder();
                int i9 = c7.g.b;
                if (readStrongBinder == null) {
                    fVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    fVar = queryLocalInterface instanceof c7.h ? (c7.h) queryLocalInterface : new c7.f(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 1);
                }
                L0.recycle();
                t7.a aVar = new t7.a(fVar);
                GoogleCircle googleCircle = new GoogleCircle(aVar);
                this.implToAbsCircleMap.put(aVar, googleCircle);
                return googleCircle;
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public IMapsProvider.IMarker addMarker(IMapsProvider.IMarkerOptions iMarkerOptions) {
            c7.a iVar;
            r7.c cVar = this.googleMap;
            t7.g gVar = ((GoogleMarkerOptions) iMarkerOptions).markerOptions;
            cVar.getClass();
            try {
                x5.l.i(gVar, "MarkerOptions must not be null.");
                s7.f fVar = cVar.a;
                Parcel M0 = fVar.M0();
                c7.b.b(M0, gVar);
                Parcel L0 = fVar.L0(M0, 11);
                IBinder readStrongBinder = L0.readStrongBinder();
                int i9 = c7.j.b;
                if (readStrongBinder == null) {
                    iVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    iVar = queryLocalInterface instanceof c7.a ? (c7.a) queryLocalInterface : new c7.i(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 1);
                }
                L0.recycle();
                t7.f fVar2 = iVar != null ? new t7.f(iVar) : null;
                GoogleMarker googleMarker = new GoogleMarker(fVar2);
                this.implToAbsMarkerMap.put(fVar2, googleMarker);
                return googleMarker;
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate) {
            r7.c cVar = this.googleMap;
            r7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            cVar.getClass();
            try {
                x5.l.i(aVar, "CameraUpdate must not be null.");
                s7.f fVar = cVar.a;
                h6.a aVar2 = aVar.a;
                Parcel M0 = fVar.M0();
                c7.b.c(M0, aVar2);
                fVar.Q0(M0, 5);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public IMapsProvider.CameraPosition getCameraPosition() {
            r7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                s7.f fVar = cVar.a;
                Parcel L0 = fVar.L0(fVar.M0(), 1);
                Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
                int i9 = c7.b.a;
                CameraPosition createFromParcel = L0.readInt() == 0 ? null : creator.createFromParcel(L0);
                L0.recycle();
                LatLng latLng = createFromParcel.a;
                return new IMapsProvider.CameraPosition(new IMapsProvider.LatLng(latLng.a, latLng.b), createFromParcel.b);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public float getMaxZoomLevel() {
            r7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                s7.f fVar = cVar.a;
                Parcel L0 = fVar.L0(fVar.M0(), 2);
                float readFloat = L0.readFloat();
                L0.recycle();
                return readFloat;
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public float getMinZoomLevel() {
            r7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                s7.f fVar = cVar.a;
                Parcel L0 = fVar.L0(fVar.M0(), 3);
                float readFloat = L0.readFloat();
                L0.recycle();
                return readFloat;
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public IMapsProvider.IProjection getProjection() {
            s7.b bVar;
            r7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                s7.f fVar = cVar.a;
                Parcel L0 = fVar.L0(fVar.M0(), 26);
                IBinder readStrongBinder = L0.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    bVar = queryLocalInterface instanceof s7.b ? (s7.b) queryLocalInterface : new s7.b(readStrongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate", 1);
                }
                L0.recycle();
                return new GoogleProjection(new r7.g(bVar));
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public IMapsProvider.IUISettings getUiSettings() {
            s7.c cVar;
            r7.c cVar2 = this.googleMap;
            cVar2.getClass();
            try {
                if (cVar2.b == null) {
                    s7.f fVar = cVar2.a;
                    Parcel L0 = fVar.L0(fVar.M0(), 25);
                    IBinder readStrongBinder = L0.readStrongBinder();
                    if (readStrongBinder == null) {
                        cVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        cVar = queryLocalInterface instanceof s7.c ? (s7.c) queryLocalInterface : new s7.c(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 1);
                    }
                    L0.recycle();
                    cVar2.b = new r7.h(cVar);
                }
                return new GoogleUISettings(cVar2.b);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void moveCamera(IMapsProvider.ICameraUpdate iCameraUpdate) {
            r7.c cVar = this.googleMap;
            r7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            cVar.getClass();
            try {
                x5.l.i(aVar, "CameraUpdate must not be null.");
                s7.f fVar = cVar.a;
                h6.a aVar2 = aVar.a;
                Parcel M0 = fVar.M0();
                c7.b.c(M0, aVar2);
                fVar.Q0(M0, 4);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setMapStyle(IMapsProvider.IMapStyleOptions iMapStyleOptions) {
            r7.c cVar = this.googleMap;
            t7.e eVar = iMapStyleOptions == null ? null : ((GoogleMapStyleOptions) iMapStyleOptions).mapStyleOptions;
            cVar.getClass();
            try {
                s7.f fVar = cVar.a;
                Parcel M0 = fVar.M0();
                c7.b.b(M0, eVar);
                Parcel L0 = fVar.L0(M0, 91);
                L0.readInt();
                L0.recycle();
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setMapType(int i9) {
            if (i9 == 0) {
                this.googleMap.a(1);
            } else if (i9 == 1) {
                this.googleMap.a(2);
            } else {
                if (i9 != 2) {
                    return;
                }
                this.googleMap.a(4);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setMyLocationEnabled(boolean z10) {
            r7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                s7.f fVar = cVar.a;
                Parcel M0 = fVar.M0();
                int i9 = c7.b.a;
                M0.writeInt(z10 ? 1 : 0);
                fVar.Q0(M0, 22);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnCameraIdleListener(Runnable runnable) {
            r7.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            g4 g4Var = new g4(runnable);
            s7.f fVar = cVar.a;
            try {
                r7.i iVar = new r7.i(g4Var, (char) 0);
                Parcel M0 = fVar.M0();
                c7.b.c(M0, iVar);
                fVar.Q0(M0, 99);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnCameraMoveListener(Runnable runnable) {
            r7.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            g4 g4Var = new g4(runnable);
            s7.f fVar = cVar.a;
            try {
                r7.i iVar = new r7.i(g4Var);
                Parcel M0 = fVar.M0();
                c7.b.c(M0, iVar);
                fVar.Q0(M0, 97);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnCameraMoveStartedListener(IMapsProvider.OnCameraMoveStartedListener onCameraMoveStartedListener) {
            r7.c cVar = this.googleMap;
            d dVar = new d(onCameraMoveStartedListener, 5);
            s7.f fVar = cVar.a;
            try {
                r7.i iVar = new r7.i(dVar);
                Parcel M0 = fVar.M0();
                c7.b.c(M0, iVar);
                fVar.Q0(M0, 96);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnMapLoadedCallback(Runnable runnable) {
            r7.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            g4 g4Var = new g4(runnable);
            s7.f fVar = cVar.a;
            try {
                r7.i iVar = new r7.i(g4Var, (byte) 0);
                Parcel M0 = fVar.M0();
                c7.b.c(M0, iVar);
                fVar.Q0(M0, 42);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnMarkerClickListener(IMapsProvider.OnMarkerClickListener onMarkerClickListener) {
            r7.c cVar = this.googleMap;
            c cVar2 = new c(2, this, onMarkerClickListener);
            s7.f fVar = cVar.a;
            try {
                r7.i iVar = new r7.i(cVar2);
                Parcel M0 = fVar.M0();
                c7.b.c(M0, iVar);
                fVar.Q0(M0, 30);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnMyLocationChangeListener(q0.a aVar) {
            r7.c cVar = this.googleMap;
            Objects.requireNonNull(aVar);
            f4 f4Var = new f4(aVar, 2);
            s7.f fVar = cVar.a;
            try {
                r7.i iVar = new r7.i(f4Var);
                Parcel M0 = fVar.M0();
                c7.b.c(M0, iVar);
                fVar.Q0(M0, 36);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setPadding(int i9, int i10, int i11, int i12) {
            r7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                s7.f fVar = cVar.a;
                Parcel M0 = fVar.M0();
                M0.writeInt(i9);
                M0.writeInt(i10);
                M0.writeInt(i11);
                M0.writeInt(i12);
                fVar.Q0(M0, 39);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        private GoogleMapImpl(r7.c cVar) {
            this.implToAbsMarkerMap = new HashMap();
            this.implToAbsCircleMap = new HashMap();
            this.googleMap = cVar;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate, final IMapsProvider.ICancelableCallback iCancelableCallback) {
            r7.c cVar = this.googleMap;
            r7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            r7.i iVar = null;
            r7.b bVar = iCancelableCallback == null ? null : new r7.b() { // from class: org.telegram.messenger.GoogleMapsProvider.GoogleMapImpl.1
                @Override // r7.b
                public void onCancel() {
                    iCancelableCallback.onCancel();
                }

                @Override // r7.b
                public void onFinish() {
                    iCancelableCallback.onFinish();
                }
            };
            cVar.getClass();
            try {
                x5.l.i(aVar, "CameraUpdate must not be null.");
                s7.f fVar = cVar.a;
                h6.a aVar2 = aVar.a;
                if (bVar != null) {
                    iVar = new r7.i(bVar);
                }
                Parcel M0 = fVar.M0();
                c7.b.c(M0, aVar2);
                c7.b.c(M0, iVar);
                fVar.Q0(M0, 6);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate, int i9, final IMapsProvider.ICancelableCallback iCancelableCallback) {
            r7.c cVar = this.googleMap;
            r7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            r7.i iVar = null;
            r7.b bVar = iCancelableCallback == null ? null : new r7.b() { // from class: org.telegram.messenger.GoogleMapsProvider.GoogleMapImpl.2
                @Override // r7.b
                public void onCancel() {
                    iCancelableCallback.onCancel();
                }

                @Override // r7.b
                public void onFinish() {
                    iCancelableCallback.onFinish();
                }
            };
            cVar.getClass();
            try {
                x5.l.i(aVar, "CameraUpdate must not be null.");
                s7.f fVar = cVar.a;
                h6.a aVar2 = aVar.a;
                if (bVar != null) {
                    iVar = new r7.i(bVar);
                }
                Parcel M0 = fVar.M0();
                c7.b.c(M0, aVar2);
                M0.writeInt(i9);
                c7.b.c(M0, iVar);
                fVar.Q0(M0, 7);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static final class GoogleMapStyleOptions implements IMapsProvider.IMapStyleOptions {
        private t7.e mapStyleOptions;

        private GoogleMapStyleOptions(t7.e eVar) {
            this.mapStyleOptions = eVar;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static final class GoogleMapView implements IMapsProvider.IMapView {
        private IMapsProvider.ITouchInterceptor dispatchInterceptor;
        private GLSurfaceView glSurfaceView;
        private IMapsProvider.ITouchInterceptor interceptInterceptor;
        private r7.d mapView;
        private Runnable onLayoutListener;

        /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
        public class 1 extends r7.d {
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
                return GoogleMapView.this.dispatchInterceptor != null ? GoogleMapView.this.dispatchInterceptor.onInterceptTouchEvent(motionEvent, new i4(this, 0)) : super.dispatchTouchEvent(motionEvent);
            }

            @Override // android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return GoogleMapView.this.interceptInterceptor != null ? GoogleMapView.this.interceptInterceptor.onInterceptTouchEvent(motionEvent, new i4(this, 1)) : super.onInterceptTouchEvent(motionEvent);
            }

            @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
                super.onLayout(z10, i9, i10, i11, i12);
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
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    findGlSurfaceView(viewGroup.getChildAt(i9));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$getMapAsync$0(q0.a aVar, r7.c cVar) {
            aVar.accept(new GoogleMapImpl(cVar));
            findGlSurfaceView(this.mapView);
        }

        @Override // org.telegram.messenger.IMapsProvider.IMapView
        public GLSurfaceView getGlSurfaceView() {
            return this.glSurfaceView;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMapView
        public void getMapAsync(q0.a aVar) {
            this.mapView.getMapAsync(new h4(this, aVar));
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

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static final class GoogleMarkerOptions implements IMapsProvider.IMarkerOptions {
        private t7.g markerOptions;

        @Override // org.telegram.messenger.IMapsProvider.IMarkerOptions
        public IMapsProvider.IMarkerOptions anchor(float f10, float f11) {
            t7.g gVar = this.markerOptions;
            gVar.e = f10;
            gVar.f = f11;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMarkerOptions
        public IMapsProvider.IMarkerOptions flat(boolean z10) {
            this.markerOptions.r = z10;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMarkerOptions
        public IMapsProvider.IMarkerOptions icon(Bitmap bitmap) {
            this.markerOptions.d = g7.m7.a(bitmap);
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
            t7.g gVar = new t7.g();
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
        public IMapsProvider.IMarkerOptions icon(int i9) {
            this.markerOptions.d = g7.m7.b(i9);
            return this;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static final class GoogleProjection implements IMapsProvider.IProjection {
        private r7.g projection;

        @Override // org.telegram.messenger.IMapsProvider.IProjection
        public Point toScreenLocation(IMapsProvider.LatLng latLng) {
            r7.g gVar = this.projection;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            gVar.getClass();
            try {
                s7.b bVar = gVar.a;
                Parcel M0 = bVar.M0();
                c7.b.b(M0, latLng2);
                Parcel L0 = bVar.L0(M0, 2);
                h6.a J0 = h6.b.J0(L0.readStrongBinder());
                L0.recycle();
                return (Point) h6.b.K0(J0);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        private GoogleProjection(r7.g gVar) {
            this.projection = gVar;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static final class GoogleUISettings implements IMapsProvider.IUISettings {
        private r7.h uiSettings;

        @Override // org.telegram.messenger.IMapsProvider.IUISettings
        public void setCompassEnabled(boolean z10) {
            r7.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                s7.c cVar = hVar.a;
                Parcel M0 = cVar.M0();
                int i9 = c7.b.a;
                M0.writeInt(z10 ? 1 : 0);
                cVar.Q0(M0, 2);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IUISettings
        public void setMyLocationButtonEnabled(boolean z10) {
            r7.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                s7.c cVar = hVar.a;
                Parcel M0 = cVar.M0();
                int i9 = c7.b.a;
                M0.writeInt(z10 ? 1 : 0);
                cVar.Q0(M0, 3);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IUISettings
        public void setZoomControlsEnabled(boolean z10) {
            r7.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                s7.c cVar = hVar.a;
                Parcel M0 = cVar.M0();
                int i9 = c7.b.a;
                M0.writeInt(z10 ? 1 : 0);
                cVar.Q0(M0, 1);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }

        private GoogleUISettings(r7.h hVar) {
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
        synchronized (r7.e.class) {
            r7.e.a(context);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public IMapsProvider.IMapStyleOptions loadRawResourceStyle(Context context, int i9) {
        InputStream openRawResource = context.getResources().openRawResource(i9);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int read = openRawResource.read(bArr, 0, 1024);
                    if (read == -1) {
                        e6.b.a(openRawResource);
                        e6.b.a(byteArrayOutputStream);
                        return new GoogleMapStyleOptions(new t7.e(new String(byteArrayOutputStream.toByteArray(), "UTF-8")));
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    e6.b.a(openRawResource);
                    e6.b.a(byteArrayOutputStream);
                    throw th;
                }
            }
        } catch (IOException e10) {
            throw new Resources.NotFoundException("Failed to read resource " + i9 + ": " + e10.toString());
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLng(IMapsProvider.LatLng latLng) {
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        try {
            s7.a aVar = g7.f7.a;
            x5.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel M0 = aVar.M0();
            c7.b.b(M0, latLng2);
            Parcel L0 = aVar.L0(M0, 8);
            h6.a J0 = h6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new GoogleCameraUpdate(new r7.a(J0));
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds(IMapsProvider.ILatLngBounds iLatLngBounds, int i9) {
        LatLngBounds latLngBounds = ((GoogleLatLngBounds) iLatLngBounds).bounds;
        x5.l.i(latLngBounds, "bounds must not be null");
        try {
            s7.a aVar = g7.f7.a;
            x5.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel M0 = aVar.M0();
            c7.b.b(M0, latLngBounds);
            M0.writeInt(i9);
            Parcel L0 = aVar.L0(M0, 10);
            h6.a J0 = h6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new GoogleCameraUpdate(new r7.a(J0));
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom(IMapsProvider.LatLng latLng, float f10) {
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        try {
            s7.a aVar = g7.f7.a;
            x5.l.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel M0 = aVar.M0();
            c7.b.b(M0, latLng2);
            M0.writeFloat(f10);
            Parcel L0 = aVar.L0(M0, 9);
            h6.a J0 = h6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new GoogleCameraUpdate(new r7.a(J0));
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
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
