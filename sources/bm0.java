// default package

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class bm0 implements pcc {
    public final /* synthetic */ byte a;

    public /* synthetic */ bm0(wh1 wh1Var) {
        this.a = (byte) 3;
    }

    @Override // pcc
    public final void a(Object obj) {
        r47 messageObject;
        r47 messageObject2;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (view instanceof cb) {
                    ((cb) view).setChecked(false);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                wh1.f1((View) obj);
                break;
            case 4:
                View view2 = (View) obj;
                if ((view2 instanceof wb2) && (messageObject = ((wb2) view2).getMessageObject()) != null) {
                    messageObject.M1 = true;
                    break;
                }
                break;
            case 5:
                View view3 = (View) obj;
                if ((view3 instanceof wb2) && (messageObject2 = ((wb2) view3).getMessageObject()) != null) {
                    messageObject2.M1 = true;
                    messageObject2.H = true;
                    break;
                }
                break;
            case 6:
                View view4 = (View) obj;
                if (view4 instanceof v09) {
                    ((v09) view4).c.invalidate();
                    break;
                }
                break;
            case 7:
                View view5 = (View) obj;
                view5.setAlpha(1.0f);
                view5.setTranslationX(0.0f);
                view5.setTranslationY(0.0f);
                break;
            case 8:
                ((View) obj).setTranslationY(0.0f);
                break;
            case 9:
                ((og3) ((View) obj)).invalidate();
                break;
            case 10:
                break;
            case 11:
                View view6 = (View) obj;
                if (view6 instanceof hx0) {
                    ((hx0) view6).getTextView().invalidate();
                    break;
                } else {
                    view6.invalidate();
                    break;
                }
            case 12:
                ((View) obj).invalidate();
                break;
            case 13:
                ((m55) obj).a();
                break;
            case 14:
                ((m55) obj).b();
                break;
            case 15:
                ((Boolean) obj).getClass();
                break;
            case 16:
                View view7 = (View) obj;
                if (view7 instanceof cb) {
                    ((cb) view7).setChecked(false);
                    break;
                }
                break;
            case 17:
                break;
            case 18:
                View view8 = (View) obj;
                if (view8 instanceof f17) {
                    f17 f17Var = (f17) view8;
                    f17Var.b.invalidate();
                    f17Var.c.invalidate();
                    break;
                } else if (view8 instanceof v09) {
                    ((v09) view8).c.invalidate();
                    break;
                } else {
                    view8.invalidate();
                    break;
                }
            case 19:
                Long l = (Long) obj;
                if (l != null && l.longValue() != Long.MAX_VALUE) {
                    e S = LaunchActivity.S();
                    if (S != null) {
                        S.presentFragment(ProfileActivity.Q2(l.longValue()));
                        break;
                    }
                } else {
                    hl.c3(new pg6((byte) 7));
                    break;
                }
                break;
            case 20:
                Drawable[] drawableArr = PhotoViewer.d9;
                break;
            case 21:
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    break;
                }
                break;
            case 22:
                RectF rectF = ProfileActivity.Z6;
                break;
            case 23:
                View view9 = (View) obj;
                if (view9 instanceof v09) {
                    ((v09) view9).d.a(false, true);
                    break;
                }
                break;
            case 24:
                HashSet hashSet = (HashSet) obj;
                String str = ob6.D0().B.f;
                hashSet.addAll(ee9.b0());
                SharedPreferences.Editor edit = uc7.e1().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                ee9.s = false;
                for (int i = 0; i < 4; i++) {
                    try {
                        uc7.s1(i).i4.f();
                    } catch (Exception unused) {
                    }
                }
                break;
            case 25:
                jn7.e().k(((Boolean) obj).booleanValue() ? 99 : 100, 4);
                break;
            case 26:
                View view10 = (View) obj;
                view10.setScaleX(1.0f);
                view10.setScaleY(1.0f);
                break;
            case 27:
                break;
            case 28:
                View view11 = (View) obj;
                if (view11 instanceof x2b) {
                    ((x2b) view11).a(true);
                    break;
                }
                break;
            default:
                View view12 = (View) obj;
                if (view12 instanceof x2b) {
                    ((x2b) view12).c(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ bm0(byte b) {
        this.a = b;
    }
}
