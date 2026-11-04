package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xe implements TextWatcher {
    public boolean a;
    public boolean b;
    public String c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ ChatActivityEnterView f;

    public xe(ChatActivityEnterView chatActivityEnterView) {
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
        te teVar;
        ee eeVar;
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
        if (chatActivityEnterView.T2 == 0) {
            if (this.b) {
                chatActivityEnterView.R0();
                this.b = false;
            }
            if (this.a) {
                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                    editable.removeSpan(imageSpan);
                }
                org.telegram.messenger.i6.m(editable, chatActivityEnterView.F0.getPaint().getFontMetricsInt(), false, null, 0);
                this.a = false;
            }
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        chatActivityEnterView.e0 = codePointCount;
        int i3 = chatActivityEnterView.d0;
        if (i3 > 0) {
            int i10 = i3 - codePointCount;
            if (i10 <= (chatActivityEnterView.q5 ? 5 : 100)) {
                if (i10 < -9999) {
                    i10 = -9999;
                }
                chatActivityEnterView.O();
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
                    chatActivityEnterView.c0.setTextColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.y6));
                    z10 = true;
                    if (chatActivityEnterView.r3 != z10) {
                        chatActivityEnterView.r3 = z10;
                        eeVar.invalidate();
                    }
                    teVar = chatActivityEnterView.n0;
                    if (teVar != null) {
                    }
                    chatActivityEnterView.z();
                    if (chatActivityEnterView.b2) {
                        chatActivityEnterView.p0 = true;
                        if (this.e) {
                        }
                    }
                    chatActivityEnterView.o1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                    chatActivityEnterView.B(true);
                    chatActivityEnterView.u1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                }
                chatActivityEnterView.c0.setTextColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.p7));
                z10 = false;
                if (chatActivityEnterView.r3 != z10 && (eeVar = chatActivityEnterView.G1) != null) {
                    chatActivityEnterView.r3 = z10;
                    eeVar.invalidate();
                }
                teVar = chatActivityEnterView.n0;
                if (teVar != null) {
                    teVar.c();
                }
                chatActivityEnterView.z();
                if (chatActivityEnterView.b2 && !chatActivityEnterView.p0 && !org.telegram.messenger.hp.s1(chatActivityEnterView.R).D3() && !org.telegram.messenger.h10.i(chatActivityEnterView.R).q() && chatActivityEnterView.e0 > org.telegram.messenger.hp.s1(chatActivityEnterView.R).T4 && chatActivityEnterView.e0 < org.telegram.messenger.hp.s1(chatActivityEnterView.R).U4) {
                    chatActivityEnterView.p0 = true;
                    if (this.e) {
                        chatActivityEnterView.p1();
                    } else {
                        org.telegram.messenger.g0.i3(new vf(this, 20), 300L);
                    }
                }
                chatActivityEnterView.o1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                chatActivityEnterView.B(true);
                chatActivityEnterView.u1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
            }
        }
        NumberTextView numberTextView2 = chatActivityEnterView.c0;
        if (numberTextView2 != null) {
            numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new x5(this, 6));
        }
        z10 = true;
        if (chatActivityEnterView.r3 != z10) {
        }
        teVar = chatActivityEnterView.n0;
        if (teVar != null) {
        }
        chatActivityEnterView.z();
        if (chatActivityEnterView.b2) {
        }
        chatActivityEnterView.o1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
        chatActivityEnterView.B(true);
        chatActivityEnterView.u1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        if (!this.d && this.f.G2) {
            this.c = charSequence.toString();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        if (this.d) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        kf kfVar = chatActivityEnterView.V0;
        boolean z10 = (kfVar == null ? org.telegram.messenger.hp.d1().getInt("selected_page", 0) : kfVar.getCurrentPage()) != 0 && (chatActivityEnterView.K2 || chatActivityEnterView.L2);
        if (((i10 == 0 && !TextUtils.isEmpty(charSequence)) || (i10 != 0 && TextUtils.isEmpty(charSequence))) && z10) {
            chatActivityEnterView.c1(false, true);
        }
        if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
            this.e = (chatActivityEnterView.F0.getLineCount() >= 4) != (chatActivityEnterView.U >= 4);
            if (!chatActivityEnterView.T && chatActivityEnterView.F0.getMeasuredWidth() > 0) {
                chatActivityEnterView.B0(chatActivityEnterView.U, chatActivityEnterView.F0.getLineCount());
            }
            int lineCount = chatActivityEnterView.F0.getLineCount();
            chatActivityEnterView.U = lineCount;
            chatActivityEnterView.o1((lineCount <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
            chatActivityEnterView.u1((chatActivityEnterView.U <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
        } else {
            this.e = false;
        }
        if (chatActivityEnterView.T2 == 1) {
            return;
        }
        if (chatActivityEnterView.C2 && !chatActivityEnterView.D0 && !chatActivityEnterView.E0 && !chatActivityEnterView.S2 && !chatActivityEnterView.Y1 && chatActivityEnterView.a2 == null && i11 > i10 && charSequence.length() > 0 && charSequence.length() == i3 + i11 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            this.b = true;
        }
        chatActivityEnterView.Y1 = false;
        chatActivityEnterView.E(true);
        CharSequence n12 = org.telegram.messenger.g0.n1(charSequence.toString());
        if (chatActivityEnterView.a3 != null && !chatActivityEnterView.S2) {
            int i12 = i11 + 1;
            if (i10 > i12 || i11 - i10 > 2 || TextUtils.isEmpty(charSequence)) {
                chatActivityEnterView.Z2 = true;
            }
            chatActivityEnterView.a3.Y0(charSequence, i10 > i12 || i11 - i10 > 2, false);
        }
        if (chatActivityEnterView.T2 != 2 && i11 - i10 > 1) {
            this.a = true;
        }
        if (chatActivityEnterView.a2 == null && !chatActivityEnterView.i2 && n12.length() != 0 && chatActivityEnterView.D2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.S2) {
            chatActivityEnterView.D2 = System.currentTimeMillis();
            uf ufVar = chatActivityEnterView.a3;
            if (ufVar != null) {
                ufVar.s1();
            }
        }
        chatActivityEnterView.S1();
    }
}
