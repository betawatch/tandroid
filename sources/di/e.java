package di;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.c20;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.vt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qy0;
import org.telegram.ui.rc;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements c20 {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        ij messageObject;
        ij messageObject2;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                break;
            case 1:
                ((View) obj).setTranslationY(0.0f);
                break;
            case 2:
                ((p) ((View) obj)).invalidate();
                break;
            case 3:
                View view2 = (View) obj;
                if (view2 instanceof kg.p1) {
                    ((kg.p1) view2).c.invalidate();
                    break;
                }
                break;
            case 4:
                View view3 = (View) obj;
                if (view3 instanceof kg.p1) {
                    ((kg.p1) view3).d.a(false, true);
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.p5 p5Var = gz.I;
                break;
            case 6:
                HashMap hashMap = org.telegram.ui.ActionBar.d3.K;
                break;
            case 7:
                int i7 = org.telegram.ui.ActionBar.b3.r;
                break;
            case 8:
                int i10 = ma.n;
                break;
            case 9:
                rc.f1((View) obj);
                break;
            case 10:
                View view4 = (View) obj;
                if ((view4 instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) view4).getMessageObject()) != null) {
                    messageObject.K1 = true;
                    break;
                }
                break;
            case 11:
                View view5 = (View) obj;
                if ((view5 instanceof org.telegram.ui.Cells.q1) && (messageObject2 = ((org.telegram.ui.Cells.q1) view5).getMessageObject()) != null) {
                    messageObject2.K1 = true;
                    messageObject2.H = true;
                    break;
                }
                break;
            case 12:
                vt vtVar = vt.O1;
                break;
            case 13:
                View view6 = (View) obj;
                if (view6 instanceof org.telegram.ui.ActionBar.o2) {
                    ((org.telegram.ui.ActionBar.o2) view6).getTextView().invalidate();
                    break;
                } else {
                    view6.invalidate();
                    break;
                }
            case 14:
                View view7 = (View) obj;
                if (view7 instanceof org.telegram.ui.Cells.f5) {
                    org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view7;
                    f5Var.b.invalidate();
                    f5Var.c.invalidate();
                    break;
                } else if (view7 instanceof kg.p1) {
                    ((kg.p1) view7).c.invalidate();
                    break;
                } else {
                    view7.invalidate();
                    break;
                }
            case 15:
                View view8 = (View) obj;
                if (view8 instanceof org.telegram.ui.Cells.z7) {
                    ((org.telegram.ui.Cells.z7) view8).a(true);
                    break;
                }
                break;
            case 16:
                View view9 = (View) obj;
                if (view9 instanceof org.telegram.ui.Cells.z7) {
                    ((org.telegram.ui.Cells.z7) view9).c(true);
                    break;
                }
                break;
            case 17:
                ((Boolean) obj).getClass();
                break;
            case 18:
                break;
            case 19:
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(ProfileActivity.A4(l10.longValue()));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new l10(24));
                    break;
                }
                break;
            case 20:
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                Drawable[] drawableArr = PhotoViewer.Y8;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    break;
                }
                break;
            case 21:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                break;
            case 22:
                RectF rectF = ProfileActivity.S6;
                break;
            case 23:
                HashSet hashSet = (HashSet) obj;
                String str = hd.E0().B.f;
                hashSet.addAll(qy0.d0());
                SharedPreferences.Editor edit = qp.e1().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                qy0.s = false;
                for (int i11 = 0; i11 < 4; i11++) {
                    try {
                        qp.s1(i11).s7.g();
                    } catch (Exception unused) {
                    }
                }
                break;
            case 24:
                View view10 = (View) obj;
                view10.setScaleX(1.0f);
                view10.setScaleY(1.0f);
                break;
            case 25:
                ArrayList arrayList = org.telegram.ui.Wallet.v2.a;
                break;
            case 26:
                ((org.telegram.ui.Wallet.t2) obj).a();
                break;
            case 27:
                ((org.telegram.ui.Wallet.t2) obj).b();
                break;
            case 28:
                View view11 = (View) obj;
                if (view11 instanceof org.telegram.ui.web.g) {
                    ((org.telegram.ui.web.g) view11).setChecked(false);
                    break;
                }
                break;
            default:
                View view12 = (View) obj;
                if (view12 instanceof org.telegram.ui.web.g) {
                    ((org.telegram.ui.web.g) view12).setChecked(false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e(rc rcVar) {
        this.a = 9;
    }
}
