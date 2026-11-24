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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bm0 implements p8c {
    public final /* synthetic */ byte a;

    public /* synthetic */ bm0(nh1 nh1Var) {
        this.a = (byte) 3;
    }

    @Override // p8c
    public final void a(Object obj) {
        k27 messageObject;
        k27 messageObject2;
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
                nh1.e1((View) obj);
                break;
            case 4:
                View view2 = (View) obj;
                if ((view2 instanceof gb2) && (messageObject = ((gb2) view2).getMessageObject()) != null) {
                    messageObject.M1 = true;
                    break;
                }
                break;
            case 5:
                View view3 = (View) obj;
                if ((view3 instanceof gb2) && (messageObject2 = ((gb2) view3).getMessageObject()) != null) {
                    messageObject2.M1 = true;
                    messageObject2.H = true;
                    break;
                }
                break;
            case 6:
                View view4 = (View) obj;
                if (view4 instanceof jx8) {
                    ((jx8) view4).c.invalidate();
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
                ((uf3) ((View) obj)).invalidate();
                break;
            case 10:
                break;
            case 11:
                View view6 = (View) obj;
                if (view6 instanceof zw0) {
                    ((zw0) view6).getTextView().invalidate();
                    break;
                } else {
                    view6.invalidate();
                    break;
                }
            case 12:
                ((View) obj).invalidate();
                break;
            case 13:
                ((i35) obj).a();
                break;
            case 14:
                ((i35) obj).b();
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
                if (view8 instanceof yy6) {
                    yy6 yy6Var = (yy6) view8;
                    yy6Var.b.invalidate();
                    yy6Var.c.invalidate();
                    break;
                } else if (view8 instanceof jx8) {
                    ((jx8) view8).c.invalidate();
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
                        S.presentFragment(ProfileActivity.P2(l.longValue()));
                        break;
                    }
                } else {
                    gl.c3(new am6((byte) 5));
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
                RectF rectF = ProfileActivity.Z6;
                break;
            case 23:
                View view9 = (View) obj;
                if (view9 instanceof jx8) {
                    ((jx8) view9).d.a(false, true);
                    break;
                }
                break;
            case 24:
                HashSet hashSet = (HashSet) obj;
                String str = k96.D0().B.f;
                hashSet.addAll(qa9.b0());
                SharedPreferences.Editor edit = na7.c1().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                qa9.s = false;
                for (int i = 0; i < 4; i++) {
                    try {
                        na7.q1(i).i4.f();
                    } catch (Exception unused) {
                    }
                }
                break;
            case 25:
                kk7.e().k(((Boolean) obj).booleanValue() ? 98 : 99, 4);
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
                if (view11 instanceof xya) {
                    ((xya) view11).a(true);
                    break;
                }
                break;
            default:
                View view12 = (View) obj;
                if (view12 instanceof xya) {
                    ((xya) view12).c(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ bm0(byte b) {
        this.a = b;
    }
}
