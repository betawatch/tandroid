package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        boolean z10;
        ve veVar;
        he heVar;
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
        if (chatActivityEnterView.A3 == 0) {
            if (this.b) {
                chatActivityEnterView.j1();
                this.b = false;
            }
            if (this.a) {
                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                    editable.removeSpan(imageSpan);
                }
                org.telegram.messenger.j6.m(editable, chatActivityEnterView.F0.getPaint().getFontMetricsInt(), false, null, 0);
                this.a = false;
            }
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        chatActivityEnterView.e0 = codePointCount;
        int i7 = chatActivityEnterView.d0;
        if (i7 > 0) {
            int i10 = i7 - codePointCount;
            if (i10 <= (chatActivityEnterView.K6 ? 5 : 100)) {
                if (i10 < -9999) {
                    i10 = -9999;
                }
                chatActivityEnterView.V();
                NumberTextView numberTextView = chatActivityEnterView.c0;
                numberTextView.a(i10, numberTextView.getVisibility() == 0);
                if (chatActivityEnterView.c0.getVisibility() != 0) {
                    chatActivityEnterView.c0.setVisibility(0);
                    chatActivityEnterView.c0.setAlpha(0.0f);
                    chatActivityEnterView.c0.setScaleX(0.5f);
                    chatActivityEnterView.c0.setScaleY(0.5f);
                }
                chatActivityEnterView.c0.animate().setListener(null).cancel();
                chatActivityEnterView.c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                if (i10 >= 0) {
                    chatActivityEnterView.c0.setTextColor(chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.y6));
                    z10 = true;
                    if (chatActivityEnterView.Y3 != z10) {
                        chatActivityEnterView.Y3 = z10;
                        heVar.invalidate();
                    }
                    veVar = chatActivityEnterView.n0;
                    if (veVar != null) {
                    }
                    chatActivityEnterView.H();
                    if (chatActivityEnterView.I2) {
                        chatActivityEnterView.p0 = true;
                        if (this.e) {
                        }
                    }
                    chatActivityEnterView.H1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                    chatActivityEnterView.J(true);
                    chatActivityEnterView.N1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                }
                chatActivityEnterView.c0.setTextColor(chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.p7));
                z10 = false;
                if (chatActivityEnterView.Y3 != z10 && (heVar = chatActivityEnterView.n2) != null) {
                    chatActivityEnterView.Y3 = z10;
                    heVar.invalidate();
                }
                veVar = chatActivityEnterView.n0;
                if (veVar != null) {
                    veVar.c();
                }
                chatActivityEnterView.H();
                if (chatActivityEnterView.I2 && !chatActivityEnterView.p0 && !org.telegram.messenger.np.s1(chatActivityEnterView.R).D3() && !org.telegram.messenger.m10.i(chatActivityEnterView.R).q() && chatActivityEnterView.e0 > org.telegram.messenger.np.s1(chatActivityEnterView.R).U4 && chatActivityEnterView.e0 < org.telegram.messenger.np.s1(chatActivityEnterView.R).V4) {
                    chatActivityEnterView.p0 = true;
                    if (this.e) {
                        chatActivityEnterView.I1();
                    } else {
                        org.telegram.messenger.g0.i3(new dg(this, 21), 300L);
                    }
                }
                chatActivityEnterView.H1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                chatActivityEnterView.J(true);
                chatActivityEnterView.N1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
            }
        }
        NumberTextView numberTextView2 = chatActivityEnterView.c0;
        if (numberTextView2 != null) {
            numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new x5(this, 6));
        }
        z10 = true;
        if (chatActivityEnterView.Y3 != z10) {
        }
        veVar = chatActivityEnterView.n0;
        if (veVar != null) {
        }
        chatActivityEnterView.H();
        if (chatActivityEnterView.I2) {
        }
        chatActivityEnterView.H1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
        chatActivityEnterView.J(true);
        chatActivityEnterView.N1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (!this.d && this.f.n3) {
            this.c = charSequence.toString();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (this.d) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        sf sfVar = chatActivityEnterView.V0;
        boolean z10 = (sfVar == null ? org.telegram.messenger.np.d1().getInt("selected_page", 0) : sfVar.getCurrentPage()) != 0 && (chatActivityEnterView.r3 || chatActivityEnterView.s3);
        if (((i10 == 0 && !TextUtils.isEmpty(charSequence)) || (i10 != 0 && TextUtils.isEmpty(charSequence))) && z10) {
            chatActivityEnterView.t1(false, true);
        }
        if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
            this.e = (chatActivityEnterView.F0.getLineCount() >= 4) != (chatActivityEnterView.U >= 4);
            if (!chatActivityEnterView.T && chatActivityEnterView.F0.getMeasuredWidth() > 0) {
                chatActivityEnterView.R0(chatActivityEnterView.U, chatActivityEnterView.F0.getLineCount());
            }
            int lineCount = chatActivityEnterView.F0.getLineCount();
            chatActivityEnterView.U = lineCount;
            chatActivityEnterView.H1((lineCount <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
            chatActivityEnterView.N1((chatActivityEnterView.U <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
        } else {
            this.e = false;
        }
        if (chatActivityEnterView.A3 == 1) {
            return;
        }
        if (chatActivityEnterView.j3 && !chatActivityEnterView.D0 && !chatActivityEnterView.E0 && !chatActivityEnterView.z3 && !chatActivityEnterView.F2 && chatActivityEnterView.H2 == null && i11 > i10 && charSequence.length() > 0 && charSequence.length() == i7 + i11 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            this.b = true;
        }
        chatActivityEnterView.F2 = false;
        chatActivityEnterView.N(true);
        CharSequence n1 = org.telegram.messenger.g0.n1(charSequence.toString());
        if (chatActivityEnterView.H3 != null && !chatActivityEnterView.z3) {
            int i12 = i11 + 1;
            if (i10 > i12 || i11 - i10 > 2 || TextUtils.isEmpty(charSequence)) {
                chatActivityEnterView.G3 = true;
            }
            chatActivityEnterView.H3.j1(charSequence, i10 > i12 || i11 - i10 > 2, false);
        }
        if (chatActivityEnterView.A3 != 2 && i11 - i10 > 1) {
            this.a = true;
        }
        if (chatActivityEnterView.H2 == null && !chatActivityEnterView.P2 && n1.length() != 0 && chatActivityEnterView.k3 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.z3) {
            chatActivityEnterView.k3 = System.currentTimeMillis();
            cg cgVar = chatActivityEnterView.H3;
            if (cgVar != null) {
                cgVar.G1();
            }
        }
        chatActivityEnterView.l2();
    }
}
