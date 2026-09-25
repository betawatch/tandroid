package c5;

import android.content.Context;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class g {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e = new h0(this, true);
    public Object f = new h0(this, false);

    public g(Context context, q qVar, of.b bVar) {
        this.b = context;
        this.c = qVar;
        this.d = bVar;
    }

    public d9.i a(int i10) {
        d9.i iVar;
        d9.i iVar2;
        HashMap hashMap = (HashMap) this.c;
        d9.i iVar3 = (d9.i) hashMap.get(Integer.valueOf(i10));
        if (iVar3 != null) {
            return iVar3;
        }
        final of.b bVar = (of.b) this.e;
        bVar.getClass();
        if (i10 != 0) {
            final int i11 = 1;
            if (i10 != 1) {
                final int i12 = 2;
                if (i10 != 2) {
                    final int i13 = 3;
                    if (i10 == 3) {
                        iVar = new i2.o(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(u2.e0.class), 3);
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException(hg.c.h(i10, "Unrecognized contentType: "));
                        }
                        iVar = new d9.i() { // from class: u2.o
                            @Override // d9.i
                            public final Object get() {
                                switch (i13) {
                                    case 0:
                                        return p.e((Class) this, bVar);
                                    case 1:
                                        return p.e((Class) this, bVar);
                                    case 2:
                                        return p.e((Class) this, bVar);
                                    default:
                                        return new v0(bVar, (c3.m) ((c5.g) this).b);
                                }
                            }
                        };
                    }
                } else {
                    final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(u2.e0.class);
                    iVar2 = new d9.i() { // from class: u2.o
                        @Override // d9.i
                        public final Object get() {
                            switch (i12) {
                                case 0:
                                    return p.e((Class) asSubclass, bVar);
                                case 1:
                                    return p.e((Class) asSubclass, bVar);
                                case 2:
                                    return p.e((Class) asSubclass, bVar);
                                default:
                                    return new v0(bVar, (c3.m) ((c5.g) asSubclass).b);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(u2.e0.class);
                iVar2 = new d9.i() { // from class: u2.o
                    @Override // d9.i
                    public final Object get() {
                        switch (i11) {
                            case 0:
                                return p.e((Class) asSubclass2, bVar);
                            case 1:
                                return p.e((Class) asSubclass2, bVar);
                            case 2:
                                return p.e((Class) asSubclass2, bVar);
                            default:
                                return new v0(bVar, (c3.m) ((c5.g) asSubclass2).b);
                        }
                    }
                };
            }
            iVar = iVar2;
        } else {
            final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(u2.e0.class);
            final int i14 = 0;
            iVar = new d9.i() { // from class: u2.o
                @Override // d9.i
                public final Object get() {
                    switch (i14) {
                        case 0:
                            return p.e((Class) asSubclass3, bVar);
                        case 1:
                            return p.e((Class) asSubclass3, bVar);
                        case 2:
                            return p.e((Class) asSubclass3, bVar);
                        default:
                            return new v0(bVar, (c3.m) ((c5.g) asSubclass3).b);
                    }
                }
            };
        }
        hashMap.put(Integer.valueOf(i10), iVar);
        return iVar;
    }
}
