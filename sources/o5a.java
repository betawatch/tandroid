// default package

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o5a extends FrameLayout {
    public boolean a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public be0 f;
    public be0 h;
    public pb0 n;
    public boolean r;
    public lm s;
    public LinearLayout w;
    public int x;

    public static fm2 a(int i, String str) {
        TLRPC.TL_authorization tL_authorization = new TLRPC.TL_authorization();
        tL_authorization.device_model = str;
        tL_authorization.platform = str;
        tL_authorization.app_name = str;
        return b(i, tL_authorization);
    }

    public static fm2 b(int i, TLRPC.TL_authorization tL_authorization) {
        int i2;
        int i3;
        int i4;
        String lowerCase = tL_authorization.platform.toLowerCase();
        if (lowerCase.isEmpty()) {
            lowerCase = tL_authorization.system_version.toLowerCase();
        }
        String lowerCase2 = tL_authorization.device_model.toLowerCase();
        if (lowerCase2.contains("safari")) {
            i2 = bkb.T7;
            i3 = bkb.a8;
            i4 = R.drawable.device_web_safari;
        } else if (lowerCase2.contains("edge")) {
            i2 = bkb.T7;
            i3 = bkb.a8;
            i4 = R.drawable.device_web_edge;
        } else if (lowerCase2.contains("chrome")) {
            i2 = bkb.T7;
            i3 = bkb.a8;
            i4 = R.drawable.device_web_chrome;
        } else if (lowerCase2.contains("opera")) {
            i2 = bkb.T7;
            i3 = bkb.a8;
            i4 = R.drawable.device_web_opera;
        } else if (lowerCase2.contains("firefox")) {
            i2 = bkb.T7;
            i3 = bkb.a8;
            i4 = R.drawable.device_web_firefox;
        } else {
            if (lowerCase2.contains("vivaldi")) {
                i2 = bkb.T7;
                i3 = bkb.a8;
            } else if (lowerCase.contains("ios")) {
                i4 = lowerCase2.contains("ipad") ? R.drawable.device_tablet_ios : R.drawable.device_phone_ios;
                i2 = bkb.S7;
                i3 = bkb.Z7;
            } else if (lowerCase.contains("windows")) {
                i2 = bkb.R7;
                i3 = bkb.Y7;
                i4 = R.drawable.device_desktop_win;
            } else if (lowerCase.contains("macos")) {
                i2 = bkb.R7;
                i3 = bkb.Y7;
                i4 = R.drawable.device_desktop_osx;
            } else if (lowerCase.contains("android")) {
                i4 = lowerCase2.contains("tab") ? R.drawable.device_tablet_android : R.drawable.device_phone_android;
                i2 = bkb.Q7;
                i3 = bkb.X7;
            } else {
                if (lowerCase.contains("fragment")) {
                    i4 = R.drawable.fragment;
                } else if (lowerCase.equalsIgnoreCase("search")) {
                    i2 = bkb.S7;
                    i3 = bkb.Z7;
                    i4 = R.drawable.msg_search;
                } else if (lowerCase.contains("anonymous")) {
                    i2 = bkb.S7;
                    i3 = bkb.Z7;
                    i4 = R.drawable.large_hidden;
                } else if (lowerCase.contains("premiumbot")) {
                    i2 = bkb.ok;
                    i3 = bkb.nk;
                    i4 = R.drawable.filled_star_plus;
                } else if (lowerCase.contains("ads")) {
                    i2 = bkb.T7;
                    i3 = bkb.a8;
                    i4 = R.drawable.msg_channel;
                } else if (lowerCase.contains("api")) {
                    i2 = bkb.Q7;
                    i3 = bkb.X7;
                    i4 = R.drawable.filled_paid_broadcast;
                } else if (lowerCase.equals("?")) {
                    i4 = R.drawable.msg_emoji_question;
                } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                    i2 = bkb.R7;
                    i3 = bkb.Y7;
                    i4 = R.drawable.device_desktop_other;
                } else {
                    i2 = bkb.T7;
                    i3 = bkb.a8;
                }
                i2 = -1;
                i3 = -1;
            }
            i4 = R.drawable.device_web_other;
        }
        Drawable mutate = a.b.getDrawable(i4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.I7, false), PorterDuff.Mode.SRC_IN));
        float f = i;
        int L = gl.L(f);
        int w0 = i2 == -1 ? -16777216 : bkb.w0(null, i2, false);
        int w02 = i3 != -1 ? bkb.w0(null, i3, false) : -16777216;
        x9 x9Var = new x9((byte) 1);
        x9Var.b = L;
        Paint paint = new Paint(1);
        x9Var.c = paint;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, L, new int[]{w0, w02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        fm2 fm2Var = new fm2(x9Var, mutate);
        if (lowerCase != null && lowerCase.contains("fragment")) {
            fm2Var.e = (int) ((mutate.getIntrinsicWidth() / 44.0f) * f);
            fm2Var.f = (int) ((mutate.getIntrinsicHeight() / 44.0f) * f);
        }
        return fm2Var;
    }

    private void setContentAlpha(float f) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setAlpha(f);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setAlpha(f);
        }
        TextView textView3 = this.b;
        if (textView3 != null) {
            textView3.setAlpha(f);
        }
        TextView textView4 = this.c;
        if (textView4 != null) {
            textView4.setAlpha(f);
        }
        be0 be0Var = this.h;
        if (be0Var != null) {
            be0Var.setAlpha(f);
        }
        be0 be0Var2 = this.f;
        if (be0Var2 != null) {
            be0Var2.setAlpha(1.0f - f);
        }
        LinearLayout linearLayout = this.w;
        if (linearLayout != null) {
            linearLayout.setAlpha(f);
        }
    }

    public final void c(TLObject tLObject, boolean z) {
        String str;
        String e1;
        TextView textView = this.c;
        TextView textView2 = this.e;
        TextView textView3 = this.d;
        TextView textView4 = this.b;
        int i = this.x;
        pb0 pb0Var = this.n;
        this.r = z;
        be0 be0Var = this.h;
        be0Var.setRoundRadius(gl.L(10.0f));
        if (tLObject instanceof TL_account.TL_connectedBot) {
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) tLObject;
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(tL_connectedBot.bot_id));
            pb0Var.q(V1);
            be0Var.setRoundRadius(gl.L(21.0f));
            be0Var.f(V1, pb0Var);
            textView4.setText(l7c.r(V1));
            textView3.setText(k96.M0(2131745368, null));
            if (TLObject.hasFlag(tL_connectedBot.flags, 2)) {
                textView2.setText(k96.a0(null, null, 2131745366, k96.x(tL_connectedBot.date, false)));
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            be0Var.setImageDrawable(b(42, tL_authorization));
            StringBuilder sb = new StringBuilder();
            if (tL_authorization.device_model.length() != 0) {
                sb.append(tL_authorization.device_model);
            }
            if (sb.length() == 0) {
                if (tL_authorization.platform.length() != 0) {
                    sb.append(tL_authorization.platform);
                }
                if (tL_authorization.system_version.length() != 0) {
                    if (tL_authorization.platform.length() != 0) {
                        sb.append(" ");
                    }
                    sb.append(tL_authorization.system_version);
                }
            }
            textView4.setText(sb);
            if ((tL_authorization.flags & 1) != 0) {
                setTag(Integer.valueOf(bkb.H6));
                e1 = k96.M0(2131747633, null);
            } else {
                setTag(Integer.valueOf(bkb.z6));
                e1 = k96.e1(tL_authorization.date_active);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (tL_authorization.country.length() != 0) {
                spannableStringBuilder.append((CharSequence) tL_authorization.country);
            }
            if (spannableStringBuilder.length() != 0) {
                wo3 wo3Var = new wo3();
                wo3Var.b = gl.L(1.5f);
                wo3Var.c = 7.0f;
                wo3Var.d = 2.0f;
                spannableStringBuilder.append((CharSequence) " . ").setSpan(wo3Var, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
            }
            spannableStringBuilder.append((CharSequence) e1);
            textView2.setText(spannableStringBuilder);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_authorization.app_name);
            sb2.append(" ");
            sb2.append(tL_authorization.app_version);
            textView3.setText(sb2);
            return;
        }
        if (tLObject instanceof TLRPC.TL_webAuthorization) {
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) tLObject;
            TLRPC.User V12 = na7.q1(i).V1(Long.valueOf(tL_webAuthorization.bot_id));
            textView4.setText(tL_webAuthorization.domain);
            if (V12 != null) {
                pb0Var.q(V12);
                str = l7c.k(V12, true);
                be0Var.f(V12, pb0Var);
            } else {
                str = "";
            }
            int i2 = bkb.z6;
            setTag(Integer.valueOf(i2));
            textView.setText(k96.e1(tL_webAuthorization.date_active));
            zkb.X(textView, i2, null);
            StringBuilder sb3 = new StringBuilder();
            if (tL_webAuthorization.ip.length() != 0) {
                sb3.append(tL_webAuthorization.ip);
            }
            if (tL_webAuthorization.region.length() != 0) {
                if (sb3.length() != 0) {
                    sb3.append(" ");
                }
                sb3.append("— ");
                sb3.append(tL_webAuthorization.region);
            }
            textView2.setText(sb3);
            StringBuilder sb4 = new StringBuilder();
            if (!TextUtils.isEmpty(str)) {
                sb4.append(str);
            }
            if (tL_webAuthorization.browser.length() != 0) {
                if (sb4.length() != 0) {
                    sb4.append(", ");
                }
                sb4.append(tL_webAuthorization.browser);
            }
            if (tL_webAuthorization.platform.length() != 0) {
                if (sb4.length() != 0) {
                    sb4.append(", ");
                }
                sb4.append(tL_webAuthorization.platform);
            }
            textView3.setText(sb4);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        setContentAlpha(1.0f - this.s.e(false, 0.0f));
        if (this.r) {
            int i = this.a ? 49 : 72;
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(i), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(i) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(!this.a ? 70.0f : 90.0f) + (this.r ? 1 : 0), TLObject.FLAG_30));
    }
}
