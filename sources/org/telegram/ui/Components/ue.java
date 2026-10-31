package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ue implements TextWatcher {
    public boolean a;
    public boolean b;
    public String c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ ChatActivityEnterView f;

    public ue(ChatActivityEnterView chatActivityEnterView) {
        this.f = chatActivityEnterView;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        qe qeVar;
        be beVar;
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
        if (chatActivityEnterView.S2 == 0) {
            if (this.b) {
                chatActivityEnterView.Q0();
                this.b = false;
            }
            if (this.a) {
                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                    editable.removeSpan(imageSpan);
                }
                org.telegram.messenger.k6.m(editable, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, null, 0);
                this.a = false;
            }
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        chatActivityEnterView.d0 = codePointCount;
        int i10 = chatActivityEnterView.c0;
        if (i10 > 0) {
            int i11 = i10 - codePointCount;
            if (i11 <= (chatActivityEnterView.p5 ? 5 : 100)) {
                if (i11 < -9999) {
                    i11 = -9999;
                }
                chatActivityEnterView.O();
                NumberTextView numberTextView = chatActivityEnterView.b0;
                numberTextView.a(i11, numberTextView.getVisibility() == 0);
                if (chatActivityEnterView.b0.getVisibility() != 0) {
                    chatActivityEnterView.b0.setVisibility(0);
                    chatActivityEnterView.b0.setAlpha(0.0f);
                    chatActivityEnterView.b0.setScaleX(0.5f);
                    chatActivityEnterView.b0.setScaleY(0.5f);
                }
                chatActivityEnterView.b0.animate().setListener(null).cancel();
                chatActivityEnterView.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                if (i11 >= 0) {
                    chatActivityEnterView.b0.setTextColor(chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.y6));
                    z10 = true;
                    if (chatActivityEnterView.q3 != z10) {
                        chatActivityEnterView.q3 = z10;
                        beVar.invalidate();
                    }
                    qeVar = chatActivityEnterView.m0;
                    if (qeVar != null) {
                    }
                    chatActivityEnterView.z();
                    if (chatActivityEnterView.a2) {
                        chatActivityEnterView.o0 = true;
                        if (this.e) {
                        }
                    }
                    chatActivityEnterView.n1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                    chatActivityEnterView.B(true);
                    chatActivityEnterView.t1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                }
                chatActivityEnterView.b0.setTextColor(chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.p7));
                z10 = false;
                if (chatActivityEnterView.q3 != z10 && (beVar = chatActivityEnterView.F1) != null) {
                    chatActivityEnterView.q3 = z10;
                    beVar.invalidate();
                }
                qeVar = chatActivityEnterView.m0;
                if (qeVar != null) {
                    qeVar.c();
                }
                chatActivityEnterView.z();
                if (chatActivityEnterView.a2 && !chatActivityEnterView.o0 && !org.telegram.messenger.vp.r1(chatActivityEnterView.Q).A3() && !org.telegram.messenger.d20.i(chatActivityEnterView.Q).q() && chatActivityEnterView.d0 > org.telegram.messenger.vp.r1(chatActivityEnterView.Q).U4 && chatActivityEnterView.d0 < org.telegram.messenger.vp.r1(chatActivityEnterView.Q).V4) {
                    chatActivityEnterView.o0 = true;
                    if (this.e) {
                        chatActivityEnterView.o1();
                    } else {
                        org.telegram.messenger.i0.h3(new tf(this, 21), 300L);
                    }
                }
                chatActivityEnterView.n1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                chatActivityEnterView.B(true);
                chatActivityEnterView.t1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
            }
        }
        NumberTextView numberTextView2 = chatActivityEnterView.b0;
        if (numberTextView2 != null) {
            numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new w5(this, 6));
        }
        z10 = true;
        if (chatActivityEnterView.q3 != z10) {
        }
        qeVar = chatActivityEnterView.m0;
        if (qeVar != null) {
        }
        chatActivityEnterView.z();
        if (chatActivityEnterView.a2) {
        }
        chatActivityEnterView.n1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
        chatActivityEnterView.B(true);
        chatActivityEnterView.t1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.d && this.f.F2) {
            this.c = charSequence.toString();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.d) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        gf gfVar = chatActivityEnterView.U0;
        boolean z10 = (gfVar == null ? org.telegram.messenger.vp.c1().getInt("selected_page", 0) : gfVar.getCurrentPage()) != 0 && (chatActivityEnterView.J2 || chatActivityEnterView.K2);
        if (((i11 == 0 && !TextUtils.isEmpty(charSequence)) || (i11 != 0 && TextUtils.isEmpty(charSequence))) && z10) {
            chatActivityEnterView.b1(false, true);
        }
        if (chatActivityEnterView.T != chatActivityEnterView.E0.getLineCount()) {
            this.e = (chatActivityEnterView.E0.getLineCount() >= 4) != (chatActivityEnterView.T >= 4);
            if (!chatActivityEnterView.S && chatActivityEnterView.E0.getMeasuredWidth() > 0) {
                chatActivityEnterView.A0(chatActivityEnterView.T, chatActivityEnterView.E0.getLineCount());
            }
            int lineCount = chatActivityEnterView.E0.getLineCount();
            chatActivityEnterView.T = lineCount;
            chatActivityEnterView.n1((lineCount <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
            chatActivityEnterView.t1((chatActivityEnterView.T <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
        } else {
            this.e = false;
        }
        if (chatActivityEnterView.S2 == 1) {
            return;
        }
        if (chatActivityEnterView.B2 && !chatActivityEnterView.C0 && !chatActivityEnterView.D0 && !chatActivityEnterView.R2 && !chatActivityEnterView.X1 && chatActivityEnterView.Z1 == null && i12 > i11 && charSequence.length() > 0 && charSequence.length() == i10 + i12 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            this.b = true;
        }
        chatActivityEnterView.X1 = false;
        chatActivityEnterView.F(true);
        CharSequence n12 = org.telegram.messenger.i0.n1(charSequence.toString());
        if (chatActivityEnterView.Z2 != null && !chatActivityEnterView.R2) {
            int i13 = i12 + 1;
            if (i11 > i13 || i12 - i11 > 2 || TextUtils.isEmpty(charSequence)) {
                chatActivityEnterView.Y2 = true;
            }
            chatActivityEnterView.Z2.V0(charSequence, i11 > i13 || i12 - i11 > 2, false);
        }
        if (chatActivityEnterView.S2 != 2 && i12 - i11 > 1) {
            this.a = true;
        }
        if (chatActivityEnterView.Z1 == null && !chatActivityEnterView.h2 && n12.length() != 0 && chatActivityEnterView.C2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.R2) {
            chatActivityEnterView.C2 = System.currentTimeMillis();
            sf sfVar = chatActivityEnterView.Z2;
            if (sfVar != null) {
                sfVar.o1();
            }
        }
        chatActivityEnterView.Q1();
    }
}
