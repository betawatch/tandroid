package org.telegram.ui.Cells;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r6 extends FrameLayout {
    public int a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public org.telegram.ui.Components.k9 f;
    public org.telegram.ui.Components.k9 h;
    public org.telegram.ui.Components.u8 n;
    public boolean r;
    public org.telegram.ui.Components.u5 s;
    public LinearLayout w;
    public int x;

    public static xp a(int i3, String str) {
        TLRPC.TL_authorization tL_authorization = new TLRPC.TL_authorization();
        tL_authorization.device_model = str;
        tL_authorization.platform = str;
        tL_authorization.app_name = str;
        return b(i3, tL_authorization);
    }

    public static xp b(int i3, TLRPC.TL_authorization tL_authorization) {
        int i10;
        int i11;
        int i12;
        String lowerCase = tL_authorization.platform.toLowerCase();
        if (lowerCase.isEmpty()) {
            lowerCase = tL_authorization.system_version.toLowerCase();
        }
        String lowerCase2 = tL_authorization.device_model.toLowerCase();
        if (lowerCase2.contains("safari")) {
            i10 = org.telegram.ui.ActionBar.k6.U7;
            i11 = org.telegram.ui.ActionBar.k6.b8;
            i12 = R.drawable.device_web_safari;
        } else if (lowerCase2.contains("edge")) {
            i10 = org.telegram.ui.ActionBar.k6.U7;
            i11 = org.telegram.ui.ActionBar.k6.b8;
            i12 = R.drawable.device_web_edge;
        } else if (lowerCase2.contains("chrome")) {
            i10 = org.telegram.ui.ActionBar.k6.U7;
            i11 = org.telegram.ui.ActionBar.k6.b8;
            i12 = R.drawable.device_web_chrome;
        } else if (lowerCase2.contains("opera")) {
            i10 = org.telegram.ui.ActionBar.k6.U7;
            i11 = org.telegram.ui.ActionBar.k6.b8;
            i12 = R.drawable.device_web_opera;
        } else if (lowerCase2.contains("firefox")) {
            i10 = org.telegram.ui.ActionBar.k6.U7;
            i11 = org.telegram.ui.ActionBar.k6.b8;
            i12 = R.drawable.device_web_firefox;
        } else {
            if (lowerCase2.contains("vivaldi")) {
                i10 = org.telegram.ui.ActionBar.k6.U7;
                i11 = org.telegram.ui.ActionBar.k6.b8;
            } else if (lowerCase.contains("ios")) {
                i12 = lowerCase2.contains("ipad") ? R.drawable.device_tablet_ios : R.drawable.device_phone_ios;
                i10 = org.telegram.ui.ActionBar.k6.T7;
                i11 = org.telegram.ui.ActionBar.k6.a8;
            } else if (lowerCase.contains("windows")) {
                i10 = org.telegram.ui.ActionBar.k6.S7;
                i11 = org.telegram.ui.ActionBar.k6.Z7;
                i12 = R.drawable.device_desktop_win;
            } else if (lowerCase.contains("macos")) {
                i10 = org.telegram.ui.ActionBar.k6.S7;
                i11 = org.telegram.ui.ActionBar.k6.Z7;
                i12 = R.drawable.device_desktop_osx;
            } else if (lowerCase.contains("android")) {
                i12 = lowerCase2.contains("tab") ? R.drawable.device_tablet_android : R.drawable.device_phone_android;
                i10 = org.telegram.ui.ActionBar.k6.R7;
                i11 = org.telegram.ui.ActionBar.k6.Y7;
            } else {
                if (lowerCase.contains("fragment")) {
                    i12 = R.drawable.fragment;
                } else if (lowerCase.equalsIgnoreCase("search")) {
                    i10 = org.telegram.ui.ActionBar.k6.T7;
                    i11 = org.telegram.ui.ActionBar.k6.a8;
                    i12 = R.drawable.msg_search;
                } else if (lowerCase.contains("anonymous")) {
                    i10 = org.telegram.ui.ActionBar.k6.T7;
                    i11 = org.telegram.ui.ActionBar.k6.a8;
                    i12 = R.drawable.large_hidden;
                } else if (lowerCase.contains("premiumbot")) {
                    i10 = org.telegram.ui.ActionBar.k6.mk;
                    i11 = org.telegram.ui.ActionBar.k6.lk;
                    i12 = R.drawable.filled_star_plus;
                } else if (lowerCase.contains("ads")) {
                    i10 = org.telegram.ui.ActionBar.k6.U7;
                    i11 = org.telegram.ui.ActionBar.k6.b8;
                    i12 = R.drawable.msg_channel;
                } else if (lowerCase.contains("api")) {
                    i10 = org.telegram.ui.ActionBar.k6.R7;
                    i11 = org.telegram.ui.ActionBar.k6.Y7;
                    i12 = R.drawable.filled_paid_broadcast;
                } else if (lowerCase.equals("?")) {
                    i12 = R.drawable.msg_emoji_question;
                } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                    i10 = org.telegram.ui.ActionBar.k6.S7;
                    i11 = org.telegram.ui.ActionBar.k6.Z7;
                    i12 = R.drawable.device_desktop_other;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.U7;
                    i11 = org.telegram.ui.ActionBar.k6.b8;
                }
                i10 = -1;
                i11 = -1;
            }
            i12 = R.drawable.device_web_other;
        }
        Drawable mutate = org.telegram.messenger.t0.b.getDrawable(i12).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J7, false), PorterDuff.Mode.SRC_IN));
        float f10 = i3;
        int L = org.telegram.messenger.g0.L(f10);
        int x02 = i10 == -1 ? -16777216 : org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int x03 = i11 != -1 ? org.telegram.ui.ActionBar.k6.x0(null, i11, false) : -16777216;
        q6 q6Var = new q6(0);
        q6Var.b = L;
        Paint paint = new Paint(1);
        q6Var.c = paint;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, L, new int[]{x02, x03}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        xp xpVar = new xp(q6Var, mutate);
        if (lowerCase != null && lowerCase.contains("fragment")) {
            xpVar.e = (int) ((mutate.getIntrinsicWidth() / 44.0f) * f10);
            xpVar.f = (int) ((mutate.getIntrinsicHeight() / 44.0f) * f10);
        }
        return xpVar;
    }

    private void setContentAlpha(float f10) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setAlpha(f10);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setAlpha(f10);
        }
        TextView textView3 = this.b;
        if (textView3 != null) {
            textView3.setAlpha(f10);
        }
        TextView textView4 = this.c;
        if (textView4 != null) {
            textView4.setAlpha(f10);
        }
        org.telegram.ui.Components.k9 k9Var = this.h;
        if (k9Var != null) {
            k9Var.setAlpha(f10);
        }
        org.telegram.ui.Components.k9 k9Var2 = this.f;
        if (k9Var2 != null) {
            k9Var2.setAlpha(1.0f - f10);
        }
        LinearLayout linearLayout = this.w;
        if (linearLayout != null) {
            linearLayout.setAlpha(f10);
        }
    }

    public final void c(TLObject tLObject, boolean z10) {
        String str;
        String e12;
        TextView textView = this.c;
        TextView textView2 = this.e;
        TextView textView3 = this.d;
        TextView textView4 = this.b;
        int i3 = this.x;
        org.telegram.ui.Components.u8 u8Var = this.n;
        this.r = z10;
        org.telegram.ui.Components.k9 k9Var = this.h;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
        if (tLObject instanceof TL_account.TL_connectedBot) {
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) tLObject;
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(tL_connectedBot.bot_id));
            u8Var.r(a22);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
            k9Var.e(a22, u8Var);
            textView4.setText(l10.p(a22));
            textView3.setText(bd.M0(2131745570, null));
            if (TLObject.hasFlag(tL_connectedBot.flags, 2)) {
                textView2.setText(bd.a0(null, null, 2131745568, bd.x(tL_connectedBot.date, false)));
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            k9Var.setImageDrawable(b(42, tL_authorization));
            StringBuilder sb2 = new StringBuilder();
            if (tL_authorization.device_model.length() != 0) {
                sb2.append(tL_authorization.device_model);
            }
            if (sb2.length() == 0) {
                if (tL_authorization.platform.length() != 0) {
                    sb2.append(tL_authorization.platform);
                }
                if (tL_authorization.system_version.length() != 0) {
                    if (tL_authorization.platform.length() != 0) {
                        sb2.append(" ");
                    }
                    sb2.append(tL_authorization.system_version);
                }
            }
            textView4.setText(sb2);
            if ((tL_authorization.flags & 1) != 0) {
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
                e12 = bd.M0(2131747834, null);
            } else {
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
                e12 = bd.e1(tL_authorization.date_active);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (tL_authorization.country.length() != 0) {
                spannableStringBuilder.append((CharSequence) tL_authorization.country);
            }
            if (spannableStringBuilder.length() != 0) {
                fs fsVar = new fs();
                fsVar.b = org.telegram.messenger.g0.L(1.5f);
                fsVar.c = 7.0f;
                fsVar.d = 2.0f;
                spannableStringBuilder.append((CharSequence) " . ").setSpan(fsVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
            }
            spannableStringBuilder.append((CharSequence) e12);
            textView2.setText(spannableStringBuilder);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_authorization.app_name);
            sb3.append(" ");
            sb3.append(tL_authorization.app_version);
            textView3.setText(sb3);
            return;
        }
        if (tLObject instanceof TLRPC.TL_webAuthorization) {
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) tLObject;
            TLRPC.User a23 = hp.s1(i3).a2(Long.valueOf(tL_webAuthorization.bot_id));
            textView4.setText(tL_webAuthorization.domain);
            if (a23 != null) {
                u8Var.r(a23);
                str = l10.j(a23, true);
                k9Var.e(a23, u8Var);
            } else {
                str = "";
            }
            int i10 = org.telegram.ui.ActionBar.k6.A6;
            setTag(Integer.valueOf(i10));
            textView.setText(bd.e1(tL_webAuthorization.date_active));
            org.telegram.ui.ActionBar.r6.V(textView, i10, null);
            StringBuilder sb4 = new StringBuilder();
            if (tL_webAuthorization.ip.length() != 0) {
                sb4.append(tL_webAuthorization.ip);
            }
            if (tL_webAuthorization.region.length() != 0) {
                if (sb4.length() != 0) {
                    sb4.append(" ");
                }
                sb4.append("— ");
                sb4.append(tL_webAuthorization.region);
            }
            textView2.setText(sb4);
            StringBuilder sb5 = new StringBuilder();
            if (!TextUtils.isEmpty(str)) {
                sb5.append(str);
            }
            if (tL_webAuthorization.browser.length() != 0) {
                if (sb5.length() != 0) {
                    sb5.append(", ");
                }
                sb5.append(tL_webAuthorization.browser);
            }
            if (tL_webAuthorization.platform.length() != 0) {
                if (sb5.length() != 0) {
                    sb5.append(", ");
                }
                sb5.append(tL_webAuthorization.platform);
            }
            textView3.setText(sb5);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        setContentAlpha(1.0f - this.s.e(false, 0.0f));
        if (this.r) {
            int i3 = this.a == 1 ? 49 : 72;
            canvas.drawLine(bd.a0 ? 0.0f : org.telegram.messenger.g0.L(i3), getMeasuredHeight() - 1, getMeasuredWidth() - (bd.a0 ? org.telegram.messenger.g0.L(i3) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.a == 0 ? 70.0f : 90.0f) + (this.r ? 1 : 0), TLObject.FLAG_30));
    }
}
