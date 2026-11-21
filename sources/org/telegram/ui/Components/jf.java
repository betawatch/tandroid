package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class jf implements TextWatcher {
    public boolean a;
    public boolean b;
    public String c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ ChatActivityEnterView f;

    public jf(ChatActivityEnterView chatActivityEnterView) {
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
        ef efVar;
        re reVar;
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
                chatActivityEnterView.v1();
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
            if (i10 <= (chatActivityEnterView.p7 ? 5 : 100)) {
                if (i10 < -9999) {
                    i10 = -9999;
                }
                chatActivityEnterView.X();
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
                    chatActivityEnterView.c0.setTextColor(chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.y6));
                    z10 = true;
                    if (chatActivityEnterView.g4 != z10) {
                        chatActivityEnterView.g4 = z10;
                        reVar.invalidate();
                    }
                    efVar = chatActivityEnterView.n0;
                    if (efVar != null) {
                    }
                    chatActivityEnterView.J();
                    if (chatActivityEnterView.Q2) {
                        chatActivityEnterView.p0 = true;
                        if (this.e) {
                        }
                    }
                    chatActivityEnterView.T1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                    chatActivityEnterView.M(true);
                    chatActivityEnterView.Z1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                }
                chatActivityEnterView.c0.setTextColor(chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.p7));
                z10 = false;
                if (chatActivityEnterView.g4 != z10 && (reVar = chatActivityEnterView.v2) != null) {
                    chatActivityEnterView.g4 = z10;
                    reVar.invalidate();
                }
                efVar = chatActivityEnterView.n0;
                if (efVar != null) {
                    efVar.c();
                }
                chatActivityEnterView.J();
                if (chatActivityEnterView.Q2 && !chatActivityEnterView.p0 && !org.telegram.messenger.mp.u1(chatActivityEnterView.R).K3() && !org.telegram.messenger.j10.i(chatActivityEnterView.R).q() && chatActivityEnterView.e0 > org.telegram.messenger.mp.u1(chatActivityEnterView.R).W4 && chatActivityEnterView.e0 < org.telegram.messenger.mp.u1(chatActivityEnterView.R).X4) {
                    chatActivityEnterView.p0 = true;
                    if (this.e) {
                        chatActivityEnterView.U1();
                    } else {
                        org.telegram.messenger.g0.h3(new og(this, 21), 300L);
                    }
                }
                chatActivityEnterView.T1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                chatActivityEnterView.M(true);
                chatActivityEnterView.Z1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
            }
        }
        NumberTextView numberTextView2 = chatActivityEnterView.c0;
        if (numberTextView2 != null) {
            numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new y(this, 7));
        }
        z10 = true;
        if (chatActivityEnterView.g4 != z10) {
        }
        efVar = chatActivityEnterView.n0;
        if (efVar != null) {
        }
        chatActivityEnterView.J();
        if (chatActivityEnterView.Q2) {
        }
        chatActivityEnterView.T1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
        chatActivityEnterView.M(true);
        chatActivityEnterView.Z1(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (this.d) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (!chatActivityEnterView.v3 || chatActivityEnterView.p0()) {
            return;
        }
        this.c = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (this.d) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        fg fgVar = chatActivityEnterView.V0;
        boolean z10 = (fgVar == null ? org.telegram.messenger.mp.f1().getInt("selected_page", 0) : fgVar.getCurrentPage()) != 0 && (chatActivityEnterView.z3 || chatActivityEnterView.A3);
        if (((i10 == 0 && !TextUtils.isEmpty(charSequence)) || (i10 != 0 && TextUtils.isEmpty(charSequence))) && z10) {
            chatActivityEnterView.F1(false, true);
        }
        if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
            this.e = (chatActivityEnterView.F0.getLineCount() >= 4) != (chatActivityEnterView.U >= 4);
            if (!chatActivityEnterView.T && chatActivityEnterView.F0.getMeasuredWidth() > 0) {
                chatActivityEnterView.d1(chatActivityEnterView.U, chatActivityEnterView.F0.getLineCount());
            }
            int lineCount = chatActivityEnterView.F0.getLineCount();
            chatActivityEnterView.U = lineCount;
            chatActivityEnterView.T1((lineCount <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
            chatActivityEnterView.Z1((chatActivityEnterView.U <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
        } else {
            this.e = false;
        }
        if (chatActivityEnterView.I3 == 1) {
            return;
        }
        if (chatActivityEnterView.r3 && !chatActivityEnterView.D0 && !chatActivityEnterView.E0 && !chatActivityEnterView.H3 && !chatActivityEnterView.N2 && chatActivityEnterView.P2 == null && i11 > i10 && charSequence.length() > 0 && charSequence.length() == i7 + i11 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            this.b = true;
        }
        chatActivityEnterView.N2 = false;
        chatActivityEnterView.P(true);
        CharSequence n1 = org.telegram.messenger.g0.n1(charSequence.toString());
        if (chatActivityEnterView.P3 != null && !chatActivityEnterView.H3) {
            int i12 = i11 + 1;
            if (i10 > i12 || i11 - i10 > 2 || TextUtils.isEmpty(charSequence)) {
                chatActivityEnterView.O3 = true;
            }
            chatActivityEnterView.P3.j1(charSequence, i10 > i12 || i11 - i10 > 2, false);
        }
        if (chatActivityEnterView.I3 != 2 && i11 - i10 > 1) {
            this.a = true;
        }
        if (chatActivityEnterView.P2 == null && !chatActivityEnterView.X2 && n1.length() != 0 && chatActivityEnterView.s3 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.H3) {
            chatActivityEnterView.s3 = System.currentTimeMillis();
            ng ngVar = chatActivityEnterView.P3;
            if (ngVar != null) {
                ngVar.G1();
            }
        }
        chatActivityEnterView.y2();
    }
}
