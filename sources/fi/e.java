package fi;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.messenger.zy;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.gu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cd0;
import org.telegram.ui.qc;
import org.telegram.ui.ry0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements w10 {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        fj messageObject;
        fj messageObject2;
        int i7 = 2;
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
                if (view2 instanceof kg.s1) {
                    ((kg.s1) view2).c.invalidate();
                    break;
                }
                break;
            case 4:
                View view3 = (View) obj;
                if (view3 instanceof kg.s1) {
                    ((kg.s1) view3).d.a(false, true);
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.q5 q5Var = zy.J;
                break;
            case 6:
                HashMap hashMap = org.telegram.ui.ActionBar.f3.L;
                break;
            case 7:
                int i10 = org.telegram.ui.ActionBar.d3.r;
                break;
            case 8:
                int i11 = pa.n;
                break;
            case 9:
                qc.f1((View) obj);
                break;
            case 10:
                View view4 = (View) obj;
                if ((view4 instanceof org.telegram.ui.Cells.r1) && (messageObject = ((org.telegram.ui.Cells.r1) view4).getMessageObject()) != null) {
                    messageObject.M1 = true;
                    break;
                }
                break;
            case 11:
                View view5 = (View) obj;
                if ((view5 instanceof org.telegram.ui.Cells.r1) && (messageObject2 = ((org.telegram.ui.Cells.r1) view5).getMessageObject()) != null) {
                    messageObject2.M1 = true;
                    messageObject2.H = true;
                    break;
                }
                break;
            case 12:
                gu guVar = gu.S1;
                break;
            case 13:
                View view6 = (View) obj;
                if (view6 instanceof org.telegram.ui.ActionBar.p2) {
                    ((org.telegram.ui.ActionBar.p2) view6).getTextView().invalidate();
                    break;
                } else {
                    view6.invalidate();
                    break;
                }
            case 14:
                View view7 = (View) obj;
                if (view7 instanceof org.telegram.ui.Cells.g5) {
                    org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view7;
                    g5Var.b.invalidate();
                    g5Var.c.invalidate();
                    break;
                } else if (view7 instanceof kg.s1) {
                    ((kg.s1) view7).c.invalidate();
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
                View view10 = (View) obj;
                if (view10 instanceof d11) {
                    ((d11) view10).a(true);
                    break;
                }
                break;
            case 18:
                ((Boolean) obj).getClass();
                break;
            case 19:
                break;
            case 20:
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(ProfileActivity.D4(l10.longValue()));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.g3(new cd0(i7));
                    break;
                }
                break;
            case 21:
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                Drawable[] drawableArr = PhotoViewer.f9;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    break;
                }
                break;
            case 22:
                Drawable[] drawableArr2 = PhotoViewer.f9;
                break;
            case 23:
                RectF rectF = ProfileActivity.Z6;
                break;
            case 24:
                HashSet hashSet = (HashSet) obj;
                String str = gd.E0().B.f;
                hashSet.addAll(ry0.d0());
                SharedPreferences.Editor edit = mp.g1().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                ry0.s = false;
                for (int i12 = 0; i12 < 4; i12++) {
                    try {
                        mp.u1(i12).v7.g();
                    } catch (Exception unused) {
                    }
                }
                break;
            case 25:
                View view11 = (View) obj;
                view11.setScaleX(1.0f);
                view11.setScaleY(1.0f);
                break;
            case 26:
                ((org.telegram.ui.Wallet.y2) obj).a();
                break;
            case 27:
                ((org.telegram.ui.Wallet.y2) obj).b();
                break;
            case 28:
                View view12 = (View) obj;
                if (view12 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view12).setChecked(false);
                    break;
                }
                break;
            default:
                View view13 = (View) obj;
                if (view13 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view13).setChecked(false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e(qc qcVar) {
        this.a = 9;
    }
}
