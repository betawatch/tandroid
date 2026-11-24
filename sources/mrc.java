// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mrc extends n39 {
    public final Context c;
    public final /* synthetic */ WallpapersListActivity d;

    public mrc(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 0;
    }

    @Override // w39
    public final int b() {
        return this.d.a;
    }

    @Override // w39
    public final int d(int i) {
        int i2;
        WallpapersListActivity wallpapersListActivity = this.d;
        i2 = wallpapersListActivity.uploadImageRow;
        if (i == i2 || i == wallpapersListActivity.h || i == wallpapersListActivity.b || i == wallpapersListActivity.e) {
            return 0;
        }
        return (i == wallpapersListActivity.f || i == wallpapersListActivity.n) ? 3 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x014c, code lost:
    
        if (((int) (r6.h * 100.0f)) == ((int) (r13.V * 100.0f))) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0122, code lost:
    
        if (r6.f == r13.U) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0130, code lost:
    
        if (r6.a == null) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        int i2;
        long j;
        Object obj;
        TLRPC.WallPaper wallPaper;
        String str;
        pha phaVar;
        TLRPC.WallPaperSettings wallPaperSettings;
        WallpapersListActivity wallpapersListActivity = this.d;
        ArrayList arrayList = wallpapersListActivity.b0;
        int i3 = s49Var.f;
        View view = s49Var.a;
        if (i3 == 0) {
            wgb wgbVar = (wgb) view;
            i2 = wallpapersListActivity.uploadImageRow;
            if (i == i2) {
                wgbVar.o(R.drawable.msg_photos, k96.M0(2131745464, null), true);
                return;
            }
            if (i == wallpapersListActivity.b) {
                wgbVar.o(R.drawable.msg_palette, k96.M0(2131745346, null), false);
                return;
            }
            if (i == wallpapersListActivity.e) {
                wgbVar.k(k96.M0(2131745915, null), false);
                return;
            } else {
                if (i == wallpapersListActivity.h) {
                    wgbVar.o(R.drawable.msg_background, "Choose from gallery", false);
                    wgbVar.j(10);
                    return;
                }
                return;
            }
        }
        if (i3 != 2) {
            if (i3 == 3) {
                mhb mhbVar = (mhb) view;
                if (i == wallpapersListActivity.f) {
                    mhbVar.setText(k96.M0(2131745912, null));
                    return;
                } else {
                    if (i == wallpapersListActivity.n) {
                        mhbVar.setText("Upload your own background for the channel.");
                        return;
                    }
                    return;
                }
            }
            return;
        }
        qqc qqcVar = (qqc) view;
        int i4 = i - wallpapersListActivity.c;
        byte b = wallpapersListActivity.O;
        int i5 = i4 * b;
        qqcVar.d(b, i5 == 0, i5 / b == wallpapersListActivity.d - 1);
        for (int i6 = 0; i6 < wallpapersListActivity.O; i6++) {
            int i7 = i5 + i6;
            Object obj2 = i7 < arrayList.size() ? arrayList.get(i7) : null;
            if (obj2 instanceof TLRPC.TL_wallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                vjb vjbVar = bkb.I.j0;
                obj = (wallpapersListActivity.P.equals(tL_wallPaper.slug) && (!wallpapersListActivity.P.equals(tL_wallPaper.slug) || (wallPaperSettings = tL_wallPaper.settings) == null || (wallpapersListActivity.Q == bkb.Y0(wallPaperSettings.background_color) && wallpapersListActivity.R == bkb.Y0(tL_wallPaper.settings.second_background_color) && wallpapersListActivity.S == bkb.Y0(tL_wallPaper.settings.third_background_color) && wallpapersListActivity.T == bkb.Y0(tL_wallPaper.settings.fourth_background_color) && (wallpapersListActivity.R == 0 || wallpapersListActivity.S != 0 || wallpapersListActivity.U == gl.q1(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern || Math.abs(bkb.S0(((float) tL_wallPaper.settings.intensity) / 100.0f) - wallpapersListActivity.V) <= 0.001f)))) ? tL_wallPaper : null;
                j = tL_wallPaper.id;
            } else {
                j = 0;
                if (obj2 instanceof krc) {
                    krc krcVar = (krc) obj2;
                    if (!"d".equals(krcVar.a) || (str = wallpapersListActivity.P) == null || !str.equals(krcVar.a)) {
                        if (krcVar.b == wallpapersListActivity.Q) {
                            int i8 = krcVar.c;
                            int i9 = wallpapersListActivity.R;
                            if (i8 == i9) {
                                if (krcVar.d == wallpapersListActivity.S) {
                                    if (krcVar.e == wallpapersListActivity.T) {
                                        if (i9 != 0) {
                                        }
                                        if ("c".equals(wallpapersListActivity.P)) {
                                        }
                                        if (!"c".equals(wallpapersListActivity.P)) {
                                            if (TextUtils.equals(wallpapersListActivity.P, krcVar.a)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        obj = null;
                        wallPaper = krcVar.k;
                        if (wallPaper != null) {
                            j = wallPaper.id;
                        }
                    }
                    obj = obj2;
                    wallPaper = krcVar.k;
                    if (wallPaper != null) {
                    }
                } else {
                    obj = ((obj2 instanceof lrc) && wallpapersListActivity.P.equals(((lrc) obj2).a)) ? obj2 : null;
                }
            }
            qqcVar.e(obj2, wallpapersListActivity.r ? 1 : 0, i6, obj);
            phaVar = ((d) wallpapersListActivity).simpleActionBar;
            if (phaVar.x()) {
                qqcVar.c(i6, wallpapersListActivity.f0.indexOfKey(j) >= 0, !wallpapersListActivity.g0);
            } else {
                qqcVar.c(i6, false, !wallpapersListActivity.g0);
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View wgbVar;
        Context context = this.c;
        if (i == 0) {
            wgbVar = new wgb(context);
        } else if (i != 3) {
            wgbVar = new u12(this, context, (byte) 1);
            wgbVar.setTag(-33024);
        } else {
            wgbVar = new mhb(context);
        }
        return new y29(wgbVar);
    }
}
