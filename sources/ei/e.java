package ei;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Components.go;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gy0;
import org.telegram.ui.pc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements u10 {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i3) {
        this.a = i3;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        zi messageObject;
        zi messageObject2;
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
                ((q) ((View) obj)).invalidate();
                break;
            case 3:
                View view2 = (View) obj;
                if (view2 instanceof lg.q1) {
                    ((lg.q1) view2).c.invalidate();
                    break;
                }
                break;
            case 4:
                View view3 = (View) obj;
                if (view3 instanceof lg.q1) {
                    ((lg.q1) view3).d.a(false, true);
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.p5 p5Var = yy.J;
                break;
            case 6:
                HashMap hashMap = org.telegram.ui.ActionBar.b3.L;
                break;
            case 7:
                int i3 = org.telegram.ui.ActionBar.z2.r;
                break;
            case 8:
                int i10 = ma.n;
                break;
            case 9:
                pc.f1((View) obj);
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
                View view6 = (View) obj;
                if (view6 instanceof org.telegram.ui.ActionBar.m2) {
                    ((org.telegram.ui.ActionBar.m2) view6).getTextView().invalidate();
                    break;
                } else {
                    view6.invalidate();
                    break;
                }
            case 13:
                View view7 = (View) obj;
                if (view7 instanceof org.telegram.ui.Cells.f5) {
                    org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view7;
                    f5Var.b.invalidate();
                    f5Var.c.invalidate();
                    break;
                } else if (view7 instanceof lg.q1) {
                    ((lg.q1) view7).c.invalidate();
                    break;
                } else {
                    view7.invalidate();
                    break;
                }
            case 14:
                View view8 = (View) obj;
                if (view8 instanceof org.telegram.ui.Cells.y7) {
                    ((org.telegram.ui.Cells.y7) view8).a(true);
                    break;
                }
                break;
            case 15:
                View view9 = (View) obj;
                if (view9 instanceof org.telegram.ui.Cells.y7) {
                    ((org.telegram.ui.Cells.y7) view9).c(true);
                    break;
                }
                break;
            case 16:
                ((Boolean) obj).getClass();
                break;
            case 17:
                break;
            case 18:
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(ProfileActivity.A4(l10.longValue()));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new go(25));
                    break;
                }
                break;
            case 19:
                RectF rectF = ProfileActivity.T6;
                break;
            case 20:
                HashSet hashSet = (HashSet) obj;
                String str = bd.E0().B.f;
                hashSet.addAll(gy0.d0());
                SharedPreferences.Editor edit = hp.e1().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                gy0.s = false;
                for (int i11 = 0; i11 < 4; i11++) {
                    try {
                        hp.s1(i11).s7.g();
                    } catch (Exception unused) {
                    }
                }
                break;
            case 21:
                View view10 = (View) obj;
                view10.setScaleX(1.0f);
                view10.setScaleY(1.0f);
                break;
            case 22:
                ArrayList arrayList = org.telegram.ui.Wallet.t2.a;
                break;
            case 23:
                ((org.telegram.ui.Wallet.r2) obj).a();
                break;
            case 24:
                ((org.telegram.ui.Wallet.r2) obj).b();
                break;
            case 25:
                View view11 = (View) obj;
                if (view11 instanceof org.telegram.ui.web.i) {
                    ((org.telegram.ui.web.i) view11).setChecked(false);
                    break;
                }
                break;
            case 26:
                View view12 = (View) obj;
                if (view12 instanceof org.telegram.ui.web.i) {
                    ((org.telegram.ui.web.i) view12).setChecked(false);
                    break;
                }
                break;
            case 27:
                ((View) obj).invalidate();
                break;
            default:
                break;
        }
    }

    public /* synthetic */ e(pc pcVar) {
        this.a = 9;
    }
}
