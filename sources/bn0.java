// default package

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bn0 implements qac {
    public final /* synthetic */ byte a;

    public /* synthetic */ bn0(vi1 vi1Var) {
        this.a = (byte) 3;
    }

    @Override // qac
    public final void a(Object obj) {
        k47 messageObject;
        k47 messageObject2;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (view instanceof bb) {
                    ((bb) view).setChecked(false);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                vi1.f1((View) obj);
                break;
            case 4:
                View view2 = (View) obj;
                if ((view2 instanceof rc2) && (messageObject = ((rc2) view2).getMessageObject()) != null) {
                    messageObject.M1 = true;
                    break;
                }
                break;
            case 5:
                View view3 = (View) obj;
                if ((view3 instanceof rc2) && (messageObject2 = ((rc2) view3).getMessageObject()) != null) {
                    messageObject2.M1 = true;
                    messageObject2.H = true;
                    break;
                }
                break;
            case 6:
                View view4 = (View) obj;
                if (view4 instanceof kz8) {
                    ((kz8) view4).c.invalidate();
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
                ((hh3) ((View) obj)).invalidate();
                break;
            case 10:
                break;
            case 11:
                View view6 = (View) obj;
                if (view6 instanceof gy0) {
                    ((gy0) view6).getTextView().invalidate();
                    break;
                } else {
                    view6.invalidate();
                    break;
                }
            case 12:
                ((View) obj).invalidate();
                break;
            case 13:
                ((i55) obj).a();
                break;
            case 14:
                ((i55) obj).b();
                break;
            case 15:
                ((Boolean) obj).getClass();
                break;
            case 16:
                View view7 = (View) obj;
                if (view7 instanceof bb) {
                    ((bb) view7).setChecked(false);
                    break;
                }
                break;
            case 17:
                break;
            case 18:
                View view8 = (View) obj;
                if (view8 instanceof y07) {
                    y07 y07Var = (y07) view8;
                    y07Var.b.invalidate();
                    y07Var.c.invalidate();
                    break;
                } else if (view8 instanceof kz8) {
                    ((kz8) view8).c.invalidate();
                    break;
                } else {
                    view8.invalidate();
                    break;
                }
            case 19:
                Long l = (Long) obj;
                if (l != null && l.longValue() != Long.MAX_VALUE) {
                    d S = LaunchActivity.S();
                    if (S != null) {
                        S.presentFragment(ProfileActivity.S2(l.longValue()));
                        break;
                    }
                } else {
                    gm.c3(new bo6((byte) 5));
                    break;
                }
                break;
            case 20:
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    break;
                }
                break;
            case 21:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                break;
            case 22:
                RectF rectF = ProfileActivity.e7;
                break;
            case 23:
                View view9 = (View) obj;
                if (view9 instanceof kz8) {
                    ((kz8) view9).d.a(false, true);
                    break;
                }
                break;
            case 24:
                HashSet hashSet = (HashSet) obj;
                String str = jb6.D0().B.f;
                hashSet.addAll(qc9.c0());
                SharedPreferences.Editor edit = oc7.d1().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                qc9.s = false;
                for (int i = 0; i < 4; i++) {
                    try {
                        oc7.r1(i).i4.f();
                    } catch (Exception unused) {
                    }
                }
                break;
            case 25:
                nm7.e().k(((Boolean) obj).booleanValue() ? 99 : 100, 4);
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
                if (view11 instanceof y0b) {
                    ((y0b) view11).a(true);
                    break;
                }
                break;
            default:
                View view12 = (View) obj;
                if (view12 instanceof y0b) {
                    ((y0b) view12).c(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ bn0(byte b) {
        this.a = b;
    }
}
