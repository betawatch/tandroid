package fi;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Components.bu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ah0;
import org.telegram.ui.oy0;
import org.telegram.ui.qc;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements z10 {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        gj messageObject;
        gj messageObject2;
        int i7 = 0;
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
                if (view2 instanceof kg.q1) {
                    ((kg.q1) view2).c.invalidate();
                    break;
                }
                break;
            case 4:
                View view3 = (View) obj;
                if (view3 instanceof kg.q1) {
                    ((kg.q1) view3).d.a(false, true);
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.p5 p5Var = ez.J;
                break;
            case 6:
                HashMap hashMap = org.telegram.ui.ActionBar.c3.L;
                break;
            case 7:
                int i10 = org.telegram.ui.ActionBar.a3.r;
                break;
            case 8:
                int i11 = ma.n;
                break;
            case 9:
                qc.f1((View) obj);
                break;
            case 10:
                View view4 = (View) obj;
                if ((view4 instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) view4).getMessageObject()) != null) {
                    messageObject.M1 = true;
                    break;
                }
                break;
            case 11:
                View view5 = (View) obj;
                if ((view5 instanceof org.telegram.ui.Cells.q1) && (messageObject2 = ((org.telegram.ui.Cells.q1) view5).getMessageObject()) != null) {
                    messageObject2.M1 = true;
                    messageObject2.H = true;
                    break;
                }
                break;
            case 12:
                bu buVar = bu.S1;
                break;
            case 13:
                View view6 = (View) obj;
                if (!(view6 instanceof org.telegram.ui.ActionBar.n2)) {
                    view6.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.ActionBar.n2) view6).getTextView().invalidate();
                    break;
                }
            case 14:
                View view7 = (View) obj;
                if (!(view7 instanceof org.telegram.ui.Cells.f5)) {
                    if (!(view7 instanceof kg.q1)) {
                        view7.invalidate();
                        break;
                    } else {
                        ((kg.q1) view7).c.invalidate();
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view7;
                    f5Var.b.invalidate();
                    f5Var.c.invalidate();
                    break;
                }
            case 15:
                View view8 = (View) obj;
                if (view8 instanceof org.telegram.ui.Cells.y7) {
                    ((org.telegram.ui.Cells.y7) view8).a(true);
                    break;
                }
                break;
            case 16:
                View view9 = (View) obj;
                if (view9 instanceof org.telegram.ui.Cells.y7) {
                    ((org.telegram.ui.Cells.y7) view9).c(true);
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
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(ProfileActivity.C4(l10.longValue()));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new ah0(i7));
                    break;
                }
                break;
            case 20:
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    break;
                }
                break;
            case 21:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                break;
            case 22:
                RectF rectF = ProfileActivity.X6;
                break;
            case 23:
                HashSet hashSet = (HashSet) obj;
                String str = hd.E0().B.f;
                hashSet.addAll(oy0.d0());
                SharedPreferences.Editor edit = np.e1().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                oy0.s = false;
                while (i7 < 4) {
                    try {
                        np.s1(i7).t7.g();
                    } catch (Exception unused) {
                    }
                    i7++;
                }
                break;
            case 24:
                View view10 = (View) obj;
                view10.setScaleX(1.0f);
                view10.setScaleY(1.0f);
                break;
            case 25:
                ArrayList arrayList = org.telegram.ui.Wallet.s2.a;
                break;
            case 26:
                ((org.telegram.ui.Wallet.q2) obj).a();
                break;
            case 27:
                ((org.telegram.ui.Wallet.q2) obj).b();
                break;
            case 28:
                View view11 = (View) obj;
                if (view11 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view11).setChecked(false);
                    break;
                }
                break;
            default:
                View view12 = (View) obj;
                if (view12 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view12).setChecked(false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e(qc qcVar) {
        this.a = 9;
    }
}
