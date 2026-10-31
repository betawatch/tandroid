package ag;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.qz;
import org.telegram.messenger.r5;
import org.telegram.messenger.vp;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e01;
import org.telegram.ui.zc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements q20 {
    public final /* synthetic */ int a;

    public /* synthetic */ z0(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        jj messageObject;
        jj messageObject2;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (view instanceof y2) {
                    ((y2) view).c.invalidate();
                    break;
                }
                break;
            case 1:
                View view2 = (View) obj;
                if (view2 instanceof y2) {
                    ((y2) view2).d.a(false, true);
                    break;
                }
                break;
            case 2:
                ((View) obj).invalidate();
                break;
            case 3:
                break;
            case 4:
                r5 r5Var = qz.I;
                break;
            case 5:
                HashMap hashMap = org.telegram.ui.ActionBar.i3.K;
                break;
            case 6:
                int i10 = org.telegram.ui.ActionBar.g3.r;
                break;
            case 7:
                int i11 = ma.n;
                break;
            case 8:
                zc.e1((View) obj);
                break;
            case 9:
                View view3 = (View) obj;
                if ((view3 instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) view3).getMessageObject()) != null) {
                    messageObject.K1 = true;
                    messageObject.H = true;
                    break;
                }
                break;
            case 10:
                View view4 = (View) obj;
                if ((view4 instanceof org.telegram.ui.Cells.q1) && (messageObject2 = ((org.telegram.ui.Cells.q1) view4).getMessageObject()) != null) {
                    messageObject2.K1 = true;
                    break;
                }
                break;
            case 11:
                View view5 = (View) obj;
                if (view5 instanceof org.telegram.ui.ActionBar.s2) {
                    ((org.telegram.ui.ActionBar.s2) view5).getTextView().invalidate();
                    break;
                } else {
                    view5.invalidate();
                    break;
                }
            case 12:
                View view6 = (View) obj;
                if (view6 instanceof j5) {
                    j5 j5Var = (j5) view6;
                    j5Var.b.invalidate();
                    j5Var.c.invalidate();
                    break;
                } else if (view6 instanceof y2) {
                    ((y2) view6).c.invalidate();
                    break;
                } else {
                    view6.invalidate();
                    break;
                }
            case 13:
                View view7 = (View) obj;
                if (view7 instanceof d8) {
                    ((d8) view7).a(true);
                    break;
                }
                break;
            case 14:
                View view8 = (View) obj;
                if (view8 instanceof d8) {
                    ((d8) view8).c(true);
                    break;
                }
                break;
            case 15:
                ((Boolean) obj).getClass();
                break;
            case 16:
                break;
            case 17:
                Long l4 = (Long) obj;
                if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(ProfileActivity.z4(l4.longValue()));
                        break;
                    }
                } else {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(12));
                    break;
                }
                break;
            case 18:
                RectF rectF = ProfileActivity.R6;
                break;
            case 19:
                HashSet hashSet = (HashSet) obj;
                String str = cd.D0().B.f;
                hashSet.addAll(e01.c0());
                SharedPreferences.Editor edit = vp.d1().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                e01.s = false;
                for (int i12 = 0; i12 < 4; i12++) {
                    try {
                        vp.r1(i12).t7.g();
                    } catch (Exception unused) {
                    }
                }
                break;
            case 20:
                View view9 = (View) obj;
                view9.setScaleX(1.0f);
                view9.setScaleY(1.0f);
                break;
            case 21:
                ArrayList arrayList = org.telegram.ui.Wallet.u2.a;
                break;
            case 22:
                ((org.telegram.ui.Wallet.s2) obj).a();
                break;
            case 23:
                ((org.telegram.ui.Wallet.s2) obj).b();
                break;
            case 24:
                View view10 = (View) obj;
                if (view10 instanceof org.telegram.ui.web.g) {
                    ((org.telegram.ui.web.g) view10).setChecked(false);
                    break;
                }
                break;
            case 25:
                View view11 = (View) obj;
                if (view11 instanceof org.telegram.ui.web.g) {
                    ((org.telegram.ui.web.g) view11).setChecked(false);
                    break;
                }
                break;
            case 26:
                View view12 = (View) obj;
                view12.setAlpha(1.0f);
                view12.setTranslationX(0.0f);
                view12.setTranslationY(0.0f);
                break;
            case 27:
                ((View) obj).setTranslationY(0.0f);
                break;
            default:
                ((th.l) ((View) obj)).invalidate();
                break;
        }
    }

    public /* synthetic */ z0(zc zcVar) {
        this.a = 8;
    }
}
