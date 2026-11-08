package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ze implements TextWatcher {
    public boolean a;
    public boolean b;
    public String c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ ChatActivityEnterView f;

    public ze(ChatActivityEnterView chatActivityEnterView) {
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
        boolean z9;
        ve veVar;
        ge geVar;
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
                chatActivityEnterView.S0();
                this.b = false;
            }
            if (this.a) {
                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                    editable.removeSpan(imageSpan);
                }
                org.telegram.messenger.i6.m(editable, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, null, 0);
                this.a = false;
            }
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        chatActivityEnterView.d0 = codePointCount;
        int i7 = chatActivityEnterView.c0;
        if (i7 > 0) {
            int i10 = i7 - codePointCount;
            if (i10 <= (chatActivityEnterView.p5 ? 5 : 100)) {
                if (i10 < -9999) {
                    i10 = -9999;
                }
                chatActivityEnterView.O();
                NumberTextView numberTextView = chatActivityEnterView.b0;
                numberTextView.a(i10, numberTextView.getVisibility() == 0);
                if (chatActivityEnterView.b0.getVisibility() != 0) {
                    chatActivityEnterView.b0.setVisibility(0);
                    chatActivityEnterView.b0.setAlpha(0.0f);
                    chatActivityEnterView.b0.setScaleX(0.5f);
                    chatActivityEnterView.b0.setScaleY(0.5f);
                }
                chatActivityEnterView.b0.animate().setListener(null).cancel();
                chatActivityEnterView.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                if (i10 >= 0) {
                    chatActivityEnterView.b0.setTextColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.y6));
                    z9 = true;
                    if (chatActivityEnterView.q3 != z9) {
                        chatActivityEnterView.q3 = z9;
                        geVar.invalidate();
                    }
                    veVar = chatActivityEnterView.m0;
                    if (veVar != null) {
                    }
                    chatActivityEnterView.z();
                    if (chatActivityEnterView.a2) {
                        chatActivityEnterView.o0 = true;
                        if (this.e) {
                        }
                    }
                    chatActivityEnterView.p1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                    chatActivityEnterView.B(true);
                    chatActivityEnterView.v1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                }
                chatActivityEnterView.b0.setTextColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.p7));
                z9 = false;
                if (chatActivityEnterView.q3 != z9 && (geVar = chatActivityEnterView.F1) != null) {
                    chatActivityEnterView.q3 = z9;
                    geVar.invalidate();
                }
                veVar = chatActivityEnterView.m0;
                if (veVar != null) {
                    veVar.c();
                }
                chatActivityEnterView.z();
                if (chatActivityEnterView.a2 && !chatActivityEnterView.o0 && !org.telegram.messenger.qp.s1(chatActivityEnterView.Q).D3() && !org.telegram.messenger.p10.i(chatActivityEnterView.Q).q() && chatActivityEnterView.d0 > org.telegram.messenger.qp.s1(chatActivityEnterView.Q).T4 && chatActivityEnterView.d0 < org.telegram.messenger.qp.s1(chatActivityEnterView.Q).U4) {
                    chatActivityEnterView.o0 = true;
                    if (this.e) {
                        chatActivityEnterView.q1();
                    } else {
                        org.telegram.messenger.g0.i3(new xf(this, 20), 300L);
                    }
                }
                chatActivityEnterView.p1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                chatActivityEnterView.B(true);
                chatActivityEnterView.v1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
            }
        }
        NumberTextView numberTextView2 = chatActivityEnterView.b0;
        if (numberTextView2 != null) {
            numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new z5(this, 6));
        }
        z9 = true;
        if (chatActivityEnterView.q3 != z9) {
        }
        veVar = chatActivityEnterView.m0;
        if (veVar != null) {
        }
        chatActivityEnterView.z();
        if (chatActivityEnterView.a2) {
        }
        chatActivityEnterView.p1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
        chatActivityEnterView.B(true);
        chatActivityEnterView.v1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (!this.d && this.f.F2) {
            this.c = charSequence.toString();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (this.d) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        mf mfVar = chatActivityEnterView.U0;
        boolean z9 = (mfVar == null ? org.telegram.messenger.qp.d1().getInt("selected_page", 0) : mfVar.getCurrentPage()) != 0 && (chatActivityEnterView.J2 || chatActivityEnterView.K2);
        if (((i10 == 0 && !TextUtils.isEmpty(charSequence)) || (i10 != 0 && TextUtils.isEmpty(charSequence))) && z9) {
            chatActivityEnterView.c1(false, true);
        }
        if (chatActivityEnterView.T != chatActivityEnterView.E0.getLineCount()) {
            this.e = (chatActivityEnterView.E0.getLineCount() >= 4) != (chatActivityEnterView.T >= 4);
            if (!chatActivityEnterView.S && chatActivityEnterView.E0.getMeasuredWidth() > 0) {
                chatActivityEnterView.C0(chatActivityEnterView.T, chatActivityEnterView.E0.getLineCount());
            }
            int lineCount = chatActivityEnterView.E0.getLineCount();
            chatActivityEnterView.T = lineCount;
            chatActivityEnterView.p1((lineCount <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
            chatActivityEnterView.v1((chatActivityEnterView.T <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
        } else {
            this.e = false;
        }
        if (chatActivityEnterView.S2 == 1) {
            return;
        }
        if (chatActivityEnterView.B2 && !chatActivityEnterView.C0 && !chatActivityEnterView.D0 && !chatActivityEnterView.R2 && !chatActivityEnterView.X1 && chatActivityEnterView.Z1 == null && i11 > i10 && charSequence.length() > 0 && charSequence.length() == i7 + i11 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            this.b = true;
        }
        chatActivityEnterView.X1 = false;
        chatActivityEnterView.E(true);
        CharSequence n1 = org.telegram.messenger.g0.n1(charSequence.toString());
        if (chatActivityEnterView.Z2 != null && !chatActivityEnterView.R2) {
            int i12 = i11 + 1;
            if (i10 > i12 || i11 - i10 > 2 || TextUtils.isEmpty(charSequence)) {
                chatActivityEnterView.Y2 = true;
            }
            chatActivityEnterView.Z2.a1(charSequence, i10 > i12 || i11 - i10 > 2, false);
        }
        if (chatActivityEnterView.S2 != 2 && i11 - i10 > 1) {
            this.a = true;
        }
        if (chatActivityEnterView.Z1 == null && !chatActivityEnterView.h2 && n1.length() != 0 && chatActivityEnterView.C2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.R2) {
            chatActivityEnterView.C2 = System.currentTimeMillis();
            wf wfVar = chatActivityEnterView.Z2;
            if (wfVar != null) {
                wfVar.t1();
            }
        }
        chatActivityEnterView.T1();
    }
}
