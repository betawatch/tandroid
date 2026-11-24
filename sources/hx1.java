// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hx1 implements TextWatcher {
    public boolean a;
    public boolean b;
    public String c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ ChatActivityEnterView f;

    public hx1(ChatActivityEnterView chatActivityEnterView) {
        this.f = chatActivityEnterView;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0199  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        boolean z;
        cx1 cx1Var;
        ow1 ow1Var;
        if (this.d) {
            return;
        }
        if (this.c != null) {
            this.d = true;
            editable.replace(0, editable.length(), this.c);
            this.c = null;
            this.d = false;
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (chatActivityEnterView.I3 == 0) {
            if (this.b) {
                chatActivityEnterView.u1();
                this.b = false;
            }
            if (this.a) {
                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                    editable.removeSpan(imageSpan);
                }
                vu3.m(editable, chatActivityEnterView.F0.getPaint().getFontMetricsInt(), false, null, 0);
                this.a = false;
            }
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        chatActivityEnterView.e0 = codePointCount;
        int i = chatActivityEnterView.d0;
        if (i > 0) {
            int i2 = i - codePointCount;
            if (i2 <= (chatActivityEnterView.o7 ? 5 : 100)) {
                if (i2 < -9999) {
                    i2 = -9999;
                }
                chatActivityEnterView.V();
                NumberTextView numberTextView = chatActivityEnterView.c0;
                numberTextView.a(i2, numberTextView.getVisibility() == 0);
                if (chatActivityEnterView.c0.getVisibility() != 0) {
                    chatActivityEnterView.c0.setVisibility(0);
                    chatActivityEnterView.c0.setAlpha(0.0f);
                    chatActivityEnterView.c0.setScaleX(0.5f);
                    chatActivityEnterView.c0.setScaleY(0.5f);
                }
                chatActivityEnterView.c0.animate().setListener(null).cancel();
                chatActivityEnterView.c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                NumberTextView numberTextView2 = chatActivityEnterView.c0;
                if (i2 >= 0) {
                    numberTextView2.setTextColor(chatActivityEnterView.F0(bkb.x6));
                    z = true;
                    if (chatActivityEnterView.g4 != z) {
                        chatActivityEnterView.g4 = z;
                        ow1Var.invalidate();
                    }
                    cx1Var = chatActivityEnterView.n0;
                    if (cx1Var != null) {
                    }
                    chatActivityEnterView.H();
                    if (chatActivityEnterView.Q2) {
                        chatActivityEnterView.p0 = true;
                        if (this.e) {
                        }
                    }
                    chatActivityEnterView.S1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                    chatActivityEnterView.J(true);
                    chatActivityEnterView.Y1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                }
                numberTextView2.setTextColor(chatActivityEnterView.F0(bkb.o7));
                z = false;
                if (chatActivityEnterView.g4 != z && (ow1Var = chatActivityEnterView.v2) != null) {
                    chatActivityEnterView.g4 = z;
                    ow1Var.invalidate();
                }
                cx1Var = chatActivityEnterView.n0;
                if (cx1Var != null) {
                    cx1Var.c();
                }
                chatActivityEnterView.H();
                if (chatActivityEnterView.Q2 && !chatActivityEnterView.p0 && !na7.q1(chatActivityEnterView.R).F3() && !y6c.h(chatActivityEnterView.R).p() && chatActivityEnterView.e0 > na7.q1(chatActivityEnterView.R).k4.g1.f() && chatActivityEnterView.e0 < na7.q1(chatActivityEnterView.R).k4.h1.f()) {
                    chatActivityEnterView.p0 = true;
                    if (this.e) {
                        chatActivityEnterView.T1();
                    } else {
                        gl.d3(new hq1(this, (byte) 9), 300L);
                    }
                }
                chatActivityEnterView.S1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                chatActivityEnterView.J(true);
                chatActivityEnterView.Y1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
            }
        }
        NumberTextView numberTextView3 = chatActivityEnterView.c0;
        if (numberTextView3 != null) {
            numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new bb1(this, (byte) 9));
        }
        z = true;
        if (chatActivityEnterView.g4 != z) {
        }
        cx1Var = chatActivityEnterView.n0;
        if (cx1Var != null) {
        }
        chatActivityEnterView.H();
        if (chatActivityEnterView.Q2) {
        }
        chatActivityEnterView.S1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
        chatActivityEnterView.J(true);
        chatActivityEnterView.Y1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.d) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (!chatActivityEnterView.v3 || chatActivityEnterView.o0()) {
            return;
        }
        this.c = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.d) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        wx1 wx1Var = chatActivityEnterView.V0;
        boolean z = (wx1Var == null ? na7.b1().getInt("selected_page", 0) : wx1Var.getCurrentPage()) != 0 && (chatActivityEnterView.z3 || chatActivityEnterView.A3);
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if (i2 != 0 ? isEmpty : !isEmpty) {
            if (z) {
                chatActivityEnterView.E1(false, true);
            }
        }
        if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
            this.e = (chatActivityEnterView.F0.getLineCount() >= 4) != (chatActivityEnterView.U >= 4);
            if (!chatActivityEnterView.T && chatActivityEnterView.F0.getMeasuredWidth() > 0) {
                chatActivityEnterView.c1(chatActivityEnterView.U, chatActivityEnterView.F0.getLineCount());
            }
            int lineCount = chatActivityEnterView.F0.getLineCount();
            chatActivityEnterView.U = lineCount;
            chatActivityEnterView.S1((lineCount <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
            chatActivityEnterView.Y1((chatActivityEnterView.U <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
        } else {
            this.e = false;
        }
        if (chatActivityEnterView.I3 == 1) {
            return;
        }
        if (chatActivityEnterView.r3 && !chatActivityEnterView.D0 && !chatActivityEnterView.E0 && !chatActivityEnterView.H3 && !chatActivityEnterView.N2 && chatActivityEnterView.P2 == null && i3 > i2 && charSequence.length() > 0 && charSequence.length() == i + i3 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            this.b = true;
        }
        chatActivityEnterView.N2 = false;
        chatActivityEnterView.N(true);
        CharSequence m1 = gl.m1(charSequence.toString());
        if (chatActivityEnterView.P3 != null && !chatActivityEnterView.H3) {
            int i4 = i3 + 1;
            if (i2 > i4 || i3 - i2 > 2 || TextUtils.isEmpty(charSequence)) {
                chatActivityEnterView.O3 = true;
            }
            chatActivityEnterView.P3.C0(charSequence, i2 > i4 || i3 - i2 > 2, false);
        }
        if (chatActivityEnterView.I3 != 2 && i3 - i2 > 1) {
            this.a = true;
        }
        if (chatActivityEnterView.P2 == null && !chatActivityEnterView.X2 && m1.length() != 0 && chatActivityEnterView.s3 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.H3) {
            chatActivityEnterView.s3 = System.currentTimeMillis();
            hy1 hy1Var = chatActivityEnterView.P3;
            if (hy1Var != null) {
                hy1Var.W0();
            }
        }
        chatActivityEnterView.x2();
    }
}
