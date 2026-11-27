// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class awc extends c79 {
    public final Context c;
    public final /* synthetic */ WallpapersListActivity d;

    public awc(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 0;
    }

    @Override // j79
    public final int b() {
        return this.d.a;
    }

    @Override // j79
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
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        int i2;
        long j;
        Object obj;
        TLRPC.WallPaper wallPaper;
        String str;
        jla jlaVar;
        TLRPC.WallPaperSettings wallPaperSettings;
        WallpapersListActivity wallpapersListActivity = this.d;
        ArrayList arrayList = wallpapersListActivity.b0;
        int i3 = f89Var.f;
        View view = f89Var.a;
        if (i3 == 0) {
            skb skbVar = (skb) view;
            i2 = wallpapersListActivity.uploadImageRow;
            if (i == i2) {
                skbVar.o(R.drawable.msg_photos, ob6.M0(2131745384, null), true);
                return;
            }
            if (i == wallpapersListActivity.b) {
                skbVar.o(R.drawable.msg_palette, ob6.M0(2131745266, null), false);
                return;
            }
            if (i == wallpapersListActivity.e) {
                skbVar.k(ob6.M0(2131745835, null), false);
                return;
            } else {
                if (i == wallpapersListActivity.h) {
                    skbVar.o(R.drawable.msg_background, "Choose from gallery", false);
                    skbVar.j(10);
                    return;
                }
                return;
            }
        }
        if (i3 != 2) {
            if (i3 == 3) {
                ilb ilbVar = (ilb) view;
                if (i == wallpapersListActivity.f) {
                    ilbVar.setText(ob6.M0(2131745832, null));
                    return;
                } else {
                    if (i == wallpapersListActivity.n) {
                        ilbVar.setText("Upload your own background for the channel.");
                        return;
                    }
                    return;
                }
            }
            return;
        }
        evc evcVar = (evc) view;
        int i4 = i - wallpapersListActivity.c;
        byte b = wallpapersListActivity.O;
        int i5 = i4 * b;
        evcVar.d(b, i5 == 0, i5 / b == wallpapersListActivity.d - 1);
        for (int i6 = 0; i6 < wallpapersListActivity.O; i6++) {
            int i7 = i5 + i6;
            Object obj2 = i7 < arrayList.size() ? arrayList.get(i7) : null;
            if (obj2 instanceof TLRPC.TL_wallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                unb unbVar = aob.I.j0;
                obj = (wallpapersListActivity.P.equals(tL_wallPaper.slug) && (!wallpapersListActivity.P.equals(tL_wallPaper.slug) || (wallPaperSettings = tL_wallPaper.settings) == null || (wallpapersListActivity.Q == aob.Y0(wallPaperSettings.background_color) && wallpapersListActivity.R == aob.Y0(tL_wallPaper.settings.second_background_color) && wallpapersListActivity.S == aob.Y0(tL_wallPaper.settings.third_background_color) && wallpapersListActivity.T == aob.Y0(tL_wallPaper.settings.fourth_background_color) && (wallpapersListActivity.R == 0 || wallpapersListActivity.S != 0 || wallpapersListActivity.U == hl.q1(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern || Math.abs(aob.S0(((float) tL_wallPaper.settings.intensity) / 100.0f) - wallpapersListActivity.V) <= 0.001f)))) ? tL_wallPaper : null;
                j = tL_wallPaper.id;
            } else {
                j = 0;
                if (obj2 instanceof yvc) {
                    yvc yvcVar = (yvc) obj2;
                    if (!"d".equals(yvcVar.a) || (str = wallpapersListActivity.P) == null || !str.equals(yvcVar.a)) {
                        if (yvcVar.b == wallpapersListActivity.Q) {
                            int i8 = yvcVar.c;
                            int i9 = wallpapersListActivity.R;
                            if (i8 == i9) {
                                if (yvcVar.d == wallpapersListActivity.S) {
                                    if (yvcVar.e == wallpapersListActivity.T) {
                                        if (i9 != 0) {
                                        }
                                        if ("c".equals(wallpapersListActivity.P)) {
                                        }
                                        if (!"c".equals(wallpapersListActivity.P)) {
                                            if (TextUtils.equals(wallpapersListActivity.P, yvcVar.a)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        obj = null;
                        wallPaper = yvcVar.k;
                        if (wallPaper != null) {
                            j = wallPaper.id;
                        }
                    }
                    obj = obj2;
                    wallPaper = yvcVar.k;
                    if (wallPaper != null) {
                    }
                } else {
                    obj = ((obj2 instanceof zvc) && wallpapersListActivity.P.equals(((zvc) obj2).a)) ? obj2 : null;
                }
            }
            evcVar.e(obj2, wallpapersListActivity.r ? 1 : 0, i6, obj);
            jlaVar = ((e) wallpapersListActivity).simpleActionBar;
            if (jlaVar.z()) {
                evcVar.c(i6, wallpapersListActivity.f0.indexOfKey(j) >= 0, !wallpapersListActivity.g0);
            } else {
                evcVar.c(i6, false, !wallpapersListActivity.g0);
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View skbVar;
        Context context = this.c;
        if (i == 0) {
            skbVar = new skb(context);
        } else if (i != 3) {
            skbVar = new l22(this, context, (byte) 1);
            skbVar.setTag(-33024);
        } else {
            skbVar = new ilb(context);
        }
        return new n69(skbVar);
    }
}
