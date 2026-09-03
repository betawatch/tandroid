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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class GoogleMapsProvider implements IMapsProvider {

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static final class GoogleCameraUpdate implements IMapsProvider.ICameraUpdate {
        private v7.a cameraUpdate;

        private GoogleCameraUpdate(v7.a aVar) {
            this.cameraUpdate = aVar;
        }
    }

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static final class GoogleCircleOptions implements IMapsProvider.ICircleOptions {
        private x7.b circleOptions;

        @Override // org.telegram.messenger.IMapsProvider.ICircleOptions
        public IMapsProvider.ICircleOptions center(IMapsProvider.LatLng latLng) {
            x7.b bVar = this.circleOptions;
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
                    arrayList.add(new x7.c(((IMapsProvider.PatternItem.Gap) patternItem).length, 1));
                } else if (patternItem instanceof IMapsProvider.PatternItem.Dash) {
                    arrayList.add(new x7.c(((IMapsProvider.PatternItem.Dash) patternItem).length, 0));
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
            x7.b bVar = new x7.b();
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

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static final class GoogleLatLngBoundsBuilder implements IMapsProvider.ILatLngBoundsBuilder {
        private x7.d builder;

        @Override // org.telegram.messenger.IMapsProvider.ILatLngBoundsBuilder
        public IMapsProvider.ILatLngBounds build() {
            x7.d dVar = this.builder;
            b6.m.j("no included points", !Double.isNaN(dVar.c));
            return new GoogleLatLngBounds(new LatLngBounds(new LatLng(dVar.a, dVar.c), new LatLng(dVar.b, dVar.d)));
        }

        @Override // org.telegram.messenger.IMapsProvider.ILatLngBoundsBuilder
        public IMapsProvider.ILatLngBoundsBuilder include(IMapsProvider.LatLng latLng) {
            x7.d dVar = this.builder;
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
            x7.d dVar = new x7.d();
            dVar.a = Double.POSITIVE_INFINITY;
            dVar.b = Double.NEGATIVE_INFINITY;
            dVar.c = Double.NaN;
            dVar.d = Double.NaN;
            this.builder = dVar;
        }
    }

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static final class GoogleMapImpl implements IMapsProvider.IMap {
        private v7.c googleMap;
        private Map<x7.a, GoogleCircle> implToAbsCircleMap;
        private Map<x7.f, GoogleMarker> implToAbsMarkerMap;

        /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
        public final class GoogleCircle implements IMapsProvider.ICircle {
            private x7.a circle;

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public double getRadius() {
                x7.a aVar = this.circle;
                aVar.getClass();
                try {
                    g7.f fVar = (g7.f) aVar.a;
                    Parcel L0 = fVar.L0(fVar.M0(), 6);
                    double readDouble = L0.readDouble();
                    L0.recycle();
                    return readDouble;
                } catch (RemoteException e6) {
                    throw new a7.b(e6);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public void remove() {
                x7.a aVar = this.circle;
                aVar.getClass();
                try {
                    g7.f fVar = (g7.f) aVar.a;
                    fVar.Q0(fVar.M0(), 1);
                    GoogleMapImpl.this.implToAbsCircleMap.remove(this.circle);
                } catch (RemoteException e6) {
                    throw new a7.b(e6);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public void setCenter(IMapsProvider.LatLng latLng) {
                x7.a aVar = this.circle;
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                aVar.getClass();
                try {
                    g7.f fVar = (g7.f) aVar.a;
                    Parcel M0 = fVar.M0();
                    g7.b.b(M0, latLng2);
                    fVar.Q0(M0, 3);
                } catch (RemoteException e6) {
                    throw new a7.b(e6);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public void setFillColor(int i10) {
                x7.a aVar = this.circle;
                aVar.getClass();
                try {
                    g7.f fVar = (g7.f) aVar.a;
                    Parcel M0 = fVar.M0();
                    M0.writeInt(i10);
                    fVar.Q0(M0, 11);
                } catch (RemoteException e6) {
                    throw new a7.b(e6);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public void setRadius(double d) {
                x7.a aVar = this.circle;
                aVar.getClass();
                try {
                    g7.f fVar = (g7.f) aVar.a;
                    Parcel M0 = fVar.M0();
                    M0.writeDouble(d);
                    fVar.Q0(M0, 5);
                } catch (RemoteException e6) {
                    throw new a7.b(e6);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.ICircle
            public void setStrokeColor(int i10) {
                x7.a aVar = this.circle;
                aVar.getClass();
                try {
                    g7.f fVar = (g7.f) aVar.a;
                    Parcel M0 = fVar.M0();
                    M0.writeInt(i10);
                    fVar.Q0(M0, 9);
                } catch (RemoteException e6) {
                    throw new a7.b(e6);
                }
            }

            private GoogleCircle(x7.a aVar) {
                this.circle = aVar;
            }
        }

        /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
        public final class GoogleMarker implements IMapsProvider.IMarker {
            private x7.f marker;

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public IMapsProvider.LatLng getPosition() {
                x7.f fVar = this.marker;
                fVar.getClass();
                try {
                    g7.i iVar = (g7.i) fVar.a;
                    Parcel L0 = iVar.L0(iVar.M0(), 4);
                    Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
                    int i10 = g7.b.a;
                    LatLng createFromParcel = L0.readInt() == 0 ? null : creator.createFromParcel(L0);
                    L0.recycle();
                    return new IMapsProvider.LatLng(createFromParcel.a, createFromParcel.b);
                } catch (RemoteException e6) {
                    throw new a7.b(e6);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public Object getTag() {
                x7.f fVar = this.marker;
                fVar.getClass();
                try {
                    g7.i iVar = (g7.i) fVar.a;
                    Parcel L0 = iVar.L0(iVar.M0(), 30);
                    l6.a J0 = l6.b.J0(L0.readStrongBinder());
                    L0.recycle();
                    return l6.b.K0(J0);
                } catch (RemoteException e6) {
                    throw new a7.b(e6);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void remove() {
                x7.f fVar = this.marker;
                fVar.getClass();
                try {
                    g7.i iVar = (g7.i) fVar.a;
                    iVar.Q0(iVar.M0(), 1);
                    GoogleMapImpl.this.implToAbsMarkerMap.remove(this.marker);
                } catch (RemoteException e6) {
                    throw new a7.b(e6);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void setIcon(Bitmap bitmap) {
                this.marker.a(k7.o8.a(bitmap));
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void setPosition(IMapsProvider.LatLng latLng) {
                x7.f fVar = this.marker;
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                fVar.getClass();
                try {
                    g7.i iVar = (g7.i) fVar.a;
                    Parcel M0 = iVar.M0();
                    g7.b.b(M0, latLng2);
                    iVar.Q0(M0, 3);
                } catch (RemoteException e6) {
                    throw new a7.b(e6);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void setRotation(int i10) {
                x7.f fVar = this.marker;
                float f10 = i10;
                fVar.getClass();
                try {
                    g7.i iVar = (g7.i) fVar.a;
                    Parcel M0 = iVar.M0();
                    M0.writeFloat(f10);
                    iVar.Q0(M0, 22);
                } catch (RemoteException e6) {
                    throw new a7.b(e6);
                }
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void setTag(Object obj) {
                x7.f fVar = this.marker;
                fVar.getClass();
                try {
                    g7.a aVar = fVar.a;
                    l6.b bVar = new l6.b(obj);
                    g7.i iVar = (g7.i) aVar;
                    Parcel M0 = iVar.M0();
                    g7.b.c(M0, bVar);
                    iVar.Q0(M0, 29);
                } catch (RemoteException e6) {
                    throw new a7.b(e6);
                }
            }

            private GoogleMarker(x7.f fVar) {
                this.marker = fVar;
            }

            @Override // org.telegram.messenger.IMapsProvider.IMarker
            public void setIcon(int i10) {
                this.marker.a(k7.o8.b(i10));
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
        public /* synthetic */ boolean lambda$setOnMarkerClickListener$1(IMapsProvider.OnMarkerClickListener onMarkerClickListener, x7.f fVar) {
            GoogleMarker googleMarker = this.implToAbsMarkerMap.get(fVar);
            if (googleMarker == null) {
                googleMarker = new GoogleMarker(fVar);
                this.implToAbsMarkerMap.put(fVar, googleMarker);
            }
            return onMarkerClickListener.onClick(googleMarker);
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public IMapsProvider.ICircle addCircle(IMapsProvider.ICircleOptions iCircleOptions) {
            g7.h fVar;
            v7.c cVar = this.googleMap;
            x7.b bVar = ((GoogleCircleOptions) iCircleOptions).circleOptions;
            cVar.getClass();
            try {
                b6.m.i(bVar, "CircleOptions must not be null.");
                w7.f fVar2 = cVar.a;
                Parcel M0 = fVar2.M0();
                g7.b.b(M0, bVar);
                Parcel L0 = fVar2.L0(M0, 35);
                IBinder readStrongBinder = L0.readStrongBinder();
                int i10 = g7.g.b;
                if (readStrongBinder == null) {
                    fVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    fVar = queryLocalInterface instanceof g7.h ? (g7.h) queryLocalInterface : new g7.f(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 5);
                }
                L0.recycle();
                x7.a aVar = new x7.a(fVar);
                GoogleCircle googleCircle = new GoogleCircle(aVar);
                this.implToAbsCircleMap.put(aVar, googleCircle);
                return googleCircle;
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public IMapsProvider.IMarker addMarker(IMapsProvider.IMarkerOptions iMarkerOptions) {
            g7.a iVar;
            v7.c cVar = this.googleMap;
            x7.g gVar = ((GoogleMarkerOptions) iMarkerOptions).markerOptions;
            cVar.getClass();
            try {
                b6.m.i(gVar, "MarkerOptions must not be null.");
                w7.f fVar = cVar.a;
                Parcel M0 = fVar.M0();
                g7.b.b(M0, gVar);
                Parcel L0 = fVar.L0(M0, 11);
                IBinder readStrongBinder = L0.readStrongBinder();
                int i10 = g7.j.b;
                if (readStrongBinder == null) {
                    iVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    iVar = queryLocalInterface instanceof g7.a ? (g7.a) queryLocalInterface : new g7.i(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 5);
                }
                L0.recycle();
                x7.f fVar2 = iVar != null ? new x7.f(iVar) : null;
                GoogleMarker googleMarker = new GoogleMarker(fVar2);
                this.implToAbsMarkerMap.put(fVar2, googleMarker);
                return googleMarker;
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate) {
            v7.c cVar = this.googleMap;
            v7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            cVar.getClass();
            try {
                b6.m.i(aVar, "CameraUpdate must not be null.");
                w7.f fVar = cVar.a;
                l6.a aVar2 = aVar.a;
                Parcel M0 = fVar.M0();
                g7.b.c(M0, aVar2);
                fVar.Q0(M0, 5);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public IMapsProvider.CameraPosition getCameraPosition() {
            v7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                w7.f fVar = cVar.a;
                Parcel L0 = fVar.L0(fVar.M0(), 1);
                Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
                int i10 = g7.b.a;
                CameraPosition createFromParcel = L0.readInt() == 0 ? null : creator.createFromParcel(L0);
                L0.recycle();
                LatLng latLng = createFromParcel.a;
                return new IMapsProvider.CameraPosition(new IMapsProvider.LatLng(latLng.a, latLng.b), createFromParcel.b);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public float getMaxZoomLevel() {
            v7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                w7.f fVar = cVar.a;
                Parcel L0 = fVar.L0(fVar.M0(), 2);
                float readFloat = L0.readFloat();
                L0.recycle();
                return readFloat;
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public float getMinZoomLevel() {
            v7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                w7.f fVar = cVar.a;
                Parcel L0 = fVar.L0(fVar.M0(), 3);
                float readFloat = L0.readFloat();
                L0.recycle();
                return readFloat;
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public IMapsProvider.IProjection getProjection() {
            w7.b bVar;
            v7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                w7.f fVar = cVar.a;
                Parcel L0 = fVar.L0(fVar.M0(), 26);
                IBinder readStrongBinder = L0.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    bVar = queryLocalInterface instanceof w7.b ? (w7.b) queryLocalInterface : new w7.b(readStrongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate", 5);
                }
                L0.recycle();
                return new GoogleProjection(new v7.g(bVar));
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public IMapsProvider.IUISettings getUiSettings() {
            w7.c cVar;
            v7.c cVar2 = this.googleMap;
            cVar2.getClass();
            try {
                if (cVar2.b == null) {
                    w7.f fVar = cVar2.a;
                    Parcel L0 = fVar.L0(fVar.M0(), 25);
                    IBinder readStrongBinder = L0.readStrongBinder();
                    if (readStrongBinder == null) {
                        cVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        cVar = queryLocalInterface instanceof w7.c ? (w7.c) queryLocalInterface : new w7.c(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 5);
                    }
                    L0.recycle();
                    cVar2.b = new v7.h(cVar);
                }
                return new GoogleUISettings(cVar2.b);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void moveCamera(IMapsProvider.ICameraUpdate iCameraUpdate) {
            v7.c cVar = this.googleMap;
            v7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            cVar.getClass();
            try {
                b6.m.i(aVar, "CameraUpdate must not be null.");
                w7.f fVar = cVar.a;
                l6.a aVar2 = aVar.a;
                Parcel M0 = fVar.M0();
                g7.b.c(M0, aVar2);
                fVar.Q0(M0, 4);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setMapStyle(IMapsProvider.IMapStyleOptions iMapStyleOptions) {
            v7.c cVar = this.googleMap;
            x7.e eVar = iMapStyleOptions == null ? null : ((GoogleMapStyleOptions) iMapStyleOptions).mapStyleOptions;
            cVar.getClass();
            try {
                w7.f fVar = cVar.a;
                Parcel M0 = fVar.M0();
                g7.b.b(M0, eVar);
                Parcel L0 = fVar.L0(M0, 91);
                L0.readInt();
                L0.recycle();
            } catch (RemoteException e6) {
                throw new a7.b(e6);
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
        public void setMyLocationEnabled(boolean z4) {
            v7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                w7.f fVar = cVar.a;
                Parcel M0 = fVar.M0();
                int i10 = g7.b.a;
                M0.writeInt(z4 ? 1 : 0);
                fVar.Q0(M0, 22);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnCameraIdleListener(Runnable runnable) {
            v7.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            j4 j4Var = new j4(runnable);
            w7.f fVar = cVar.a;
            try {
                v7.i iVar = new v7.i(j4Var, (char) 0);
                Parcel M0 = fVar.M0();
                g7.b.c(M0, iVar);
                fVar.Q0(M0, 99);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnCameraMoveListener(Runnable runnable) {
            v7.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            j4 j4Var = new j4(runnable);
            w7.f fVar = cVar.a;
            try {
                v7.i iVar = new v7.i(j4Var);
                Parcel M0 = fVar.M0();
                g7.b.c(M0, iVar);
                fVar.Q0(M0, 97);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnCameraMoveStartedListener(IMapsProvider.OnCameraMoveStartedListener onCameraMoveStartedListener) {
            v7.c cVar = this.googleMap;
            d0 d0Var = new d0(onCameraMoveStartedListener, 4);
            w7.f fVar = cVar.a;
            try {
                v7.i iVar = new v7.i(d0Var);
                Parcel M0 = fVar.M0();
                g7.b.c(M0, iVar);
                fVar.Q0(M0, 96);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnMapLoadedCallback(Runnable runnable) {
            v7.c cVar = this.googleMap;
            Objects.requireNonNull(runnable);
            j4 j4Var = new j4(runnable);
            w7.f fVar = cVar.a;
            try {
                v7.i iVar = new v7.i(j4Var, (byte) 0);
                Parcel M0 = fVar.M0();
                g7.b.c(M0, iVar);
                fVar.Q0(M0, 42);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnMarkerClickListener(IMapsProvider.OnMarkerClickListener onMarkerClickListener) {
            v7.c cVar = this.googleMap;
            c cVar2 = new c(3, this, onMarkerClickListener);
            w7.f fVar = cVar.a;
            try {
                v7.i iVar = new v7.i(cVar2);
                Parcel M0 = fVar.M0();
                g7.b.c(M0, iVar);
                fVar.Q0(M0, 30);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setOnMyLocationChangeListener(q0.a aVar) {
            v7.c cVar = this.googleMap;
            Objects.requireNonNull(aVar);
            i4 i4Var = new i4(aVar, 2);
            w7.f fVar = cVar.a;
            try {
                v7.i iVar = new v7.i(i4Var);
                Parcel M0 = fVar.M0();
                g7.b.c(M0, iVar);
                fVar.Q0(M0, 36);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void setPadding(int i10, int i11, int i12, int i13) {
            v7.c cVar = this.googleMap;
            cVar.getClass();
            try {
                w7.f fVar = cVar.a;
                Parcel M0 = fVar.M0();
                M0.writeInt(i10);
                M0.writeInt(i11);
                M0.writeInt(i12);
                M0.writeInt(i13);
                fVar.Q0(M0, 39);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        private GoogleMapImpl(v7.c cVar) {
            this.implToAbsMarkerMap = new HashMap();
            this.implToAbsCircleMap = new HashMap();
            this.googleMap = cVar;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate, final IMapsProvider.ICancelableCallback iCancelableCallback) {
            v7.c cVar = this.googleMap;
            v7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            v7.i iVar = null;
            v7.b bVar = iCancelableCallback == null ? null : new v7.b() { // from class: org.telegram.messenger.GoogleMapsProvider.GoogleMapImpl.1
                @Override // v7.b
                public void onCancel() {
                    iCancelableCallback.onCancel();
                }

                @Override // v7.b
                public void onFinish() {
                    iCancelableCallback.onFinish();
                }
            };
            cVar.getClass();
            try {
                b6.m.i(aVar, "CameraUpdate must not be null.");
                w7.f fVar = cVar.a;
                l6.a aVar2 = aVar.a;
                if (bVar != null) {
                    iVar = new v7.i(bVar);
                }
                Parcel M0 = fVar.M0();
                g7.b.c(M0, aVar2);
                g7.b.c(M0, iVar);
                fVar.Q0(M0, 6);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IMap
        public void animateCamera(IMapsProvider.ICameraUpdate iCameraUpdate, int i10, final IMapsProvider.ICancelableCallback iCancelableCallback) {
            v7.c cVar = this.googleMap;
            v7.a aVar = ((GoogleCameraUpdate) iCameraUpdate).cameraUpdate;
            v7.i iVar = null;
            v7.b bVar = iCancelableCallback == null ? null : new v7.b() { // from class: org.telegram.messenger.GoogleMapsProvider.GoogleMapImpl.2
                @Override // v7.b
                public void onCancel() {
                    iCancelableCallback.onCancel();
                }

                @Override // v7.b
                public void onFinish() {
                    iCancelableCallback.onFinish();
                }
            };
            cVar.getClass();
            try {
                b6.m.i(aVar, "CameraUpdate must not be null.");
                w7.f fVar = cVar.a;
                l6.a aVar2 = aVar.a;
                if (bVar != null) {
                    iVar = new v7.i(bVar);
                }
                Parcel M0 = fVar.M0();
                g7.b.c(M0, aVar2);
                M0.writeInt(i10);
                g7.b.c(M0, iVar);
                fVar.Q0(M0, 7);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }
    }

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static final class GoogleMapStyleOptions implements IMapsProvider.IMapStyleOptions {
        private x7.e mapStyleOptions;

        private GoogleMapStyleOptions(x7.e eVar) {
            this.mapStyleOptions = eVar;
        }
    }

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static final class GoogleMapView implements IMapsProvider.IMapView {
        private IMapsProvider.ITouchInterceptor dispatchInterceptor;
        private GLSurfaceView glSurfaceView;
        private IMapsProvider.ITouchInterceptor interceptInterceptor;
        private v7.d mapView;
        private Runnable onLayoutListener;

        /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
        public class 1 extends v7.d {
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
                return GoogleMapView.this.dispatchInterceptor != null ? GoogleMapView.this.dispatchInterceptor.onInterceptTouchEvent(motionEvent, new l4(this, 0)) : super.dispatchTouchEvent(motionEvent);
            }

            @Override // android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return GoogleMapView.this.interceptInterceptor != null ? GoogleMapView.this.interceptInterceptor.onInterceptTouchEvent(motionEvent, new l4(this, 1)) : super.onInterceptTouchEvent(motionEvent);
            }

            @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
                super.onLayout(z4, i10, i11, i12, i13);
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
        public /* synthetic */ void lambda$getMapAsync$0(q0.a aVar, v7.c cVar) {
            aVar.accept(new GoogleMapImpl(cVar));
            findGlSurfaceView(this.mapView);
        }

        @Override // org.telegram.messenger.IMapsProvider.IMapView
        public GLSurfaceView getGlSurfaceView() {
            return this.glSurfaceView;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMapView
        public void getMapAsync(q0.a aVar) {
            this.mapView.getMapAsync(new k4(this, aVar));
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

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static final class GoogleMarkerOptions implements IMapsProvider.IMarkerOptions {
        private x7.g markerOptions;

        @Override // org.telegram.messenger.IMapsProvider.IMarkerOptions
        public IMapsProvider.IMarkerOptions anchor(float f10, float f11) {
            x7.g gVar = this.markerOptions;
            gVar.e = f10;
            gVar.f = f11;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMarkerOptions
        public IMapsProvider.IMarkerOptions flat(boolean z4) {
            this.markerOptions.r = z4;
            return this;
        }

        @Override // org.telegram.messenger.IMapsProvider.IMarkerOptions
        public IMapsProvider.IMarkerOptions icon(Bitmap bitmap) {
            this.markerOptions.d = k7.o8.a(bitmap);
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
            x7.g gVar = new x7.g();
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
            this.markerOptions.d = k7.o8.b(i10);
            return this;
        }
    }

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static final class GoogleProjection implements IMapsProvider.IProjection {
        private v7.g projection;

        @Override // org.telegram.messenger.IMapsProvider.IProjection
        public Point toScreenLocation(IMapsProvider.LatLng latLng) {
            v7.g gVar = this.projection;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            gVar.getClass();
            try {
                w7.b bVar = gVar.a;
                Parcel M0 = bVar.M0();
                g7.b.b(M0, latLng2);
                Parcel L0 = bVar.L0(M0, 2);
                l6.a J0 = l6.b.J0(L0.readStrongBinder());
                L0.recycle();
                return (Point) l6.b.K0(J0);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        private GoogleProjection(v7.g gVar) {
            this.projection = gVar;
        }
    }

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static final class GoogleUISettings implements IMapsProvider.IUISettings {
        private v7.h uiSettings;

        @Override // org.telegram.messenger.IMapsProvider.IUISettings
        public void setCompassEnabled(boolean z4) {
            v7.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                w7.c cVar = hVar.a;
                Parcel M0 = cVar.M0();
                int i10 = g7.b.a;
                M0.writeInt(z4 ? 1 : 0);
                cVar.Q0(M0, 2);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IUISettings
        public void setMyLocationButtonEnabled(boolean z4) {
            v7.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                w7.c cVar = hVar.a;
                Parcel M0 = cVar.M0();
                int i10 = g7.b.a;
                M0.writeInt(z4 ? 1 : 0);
                cVar.Q0(M0, 3);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        @Override // org.telegram.messenger.IMapsProvider.IUISettings
        public void setZoomControlsEnabled(boolean z4) {
            v7.h hVar = this.uiSettings;
            hVar.getClass();
            try {
                w7.c cVar = hVar.a;
                Parcel M0 = cVar.M0();
                int i10 = g7.b.a;
                M0.writeInt(z4 ? 1 : 0);
                cVar.Q0(M0, 1);
            } catch (RemoteException e6) {
                throw new a7.b(e6);
            }
        }

        private GoogleUISettings(v7.h hVar) {
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
        synchronized (v7.e.class) {
            v7.e.a(context);
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
                        i6.b.a(openRawResource);
                        i6.b.a(byteArrayOutputStream);
                        return new GoogleMapStyleOptions(new x7.e(new String(byteArrayOutputStream.toByteArray(), "UTF-8")));
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th2) {
                    i6.b.a(openRawResource);
                    i6.b.a(byteArrayOutputStream);
                    throw th2;
                }
            }
        } catch (IOException e6) {
            throw new Resources.NotFoundException("Failed to read resource " + i10 + ": " + e6.toString());
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLng(IMapsProvider.LatLng latLng) {
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        try {
            w7.a aVar = k7.g8.a;
            b6.m.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel M0 = aVar.M0();
            g7.b.b(M0, latLng2);
            Parcel L0 = aVar.L0(M0, 8);
            l6.a J0 = l6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new GoogleCameraUpdate(new v7.a(J0));
        } catch (RemoteException e6) {
            throw new a7.b(e6);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds(IMapsProvider.ILatLngBounds iLatLngBounds, int i10) {
        LatLngBounds latLngBounds = ((GoogleLatLngBounds) iLatLngBounds).bounds;
        b6.m.i(latLngBounds, "bounds must not be null");
        try {
            w7.a aVar = k7.g8.a;
            b6.m.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel M0 = aVar.M0();
            g7.b.b(M0, latLngBounds);
            M0.writeInt(i10);
            Parcel L0 = aVar.L0(M0, 10);
            l6.a J0 = l6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new GoogleCameraUpdate(new v7.a(J0));
        } catch (RemoteException e6) {
            throw new a7.b(e6);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom(IMapsProvider.LatLng latLng, float f10) {
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        try {
            w7.a aVar = k7.g8.a;
            b6.m.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel M0 = aVar.M0();
            g7.b.b(M0, latLng2);
            M0.writeFloat(f10);
            Parcel L0 = aVar.L0(M0, 9);
            l6.a J0 = l6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new GoogleCameraUpdate(new v7.a(J0));
        } catch (RemoteException e6) {
            throw new a7.b(e6);
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
