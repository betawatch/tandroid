package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class df implements TextWatcher {
    public boolean a;
    public boolean b;
    public String c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ ChatActivityEnterView f;

    public df(ChatActivityEnterView chatActivityEnterView) {
        this.f = chatActivityEnterView;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0192  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        ze zeVar;
        ke keVar;
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
        if (chatActivityEnterView.N2 == 0) {
            if (this.b) {
                chatActivityEnterView.S0();
                this.b = false;
            }
            if (this.a) {
                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                    editable.removeSpan(imageSpan);
                }
                Emoji.replaceEmoji((CharSequence) editable, chatActivityEnterView.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
                this.a = false;
            }
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        chatActivityEnterView.W = codePointCount;
        int i10 = chatActivityEnterView.V;
        if (i10 > 0) {
            int i11 = i10 - codePointCount;
            if (i11 <= (chatActivityEnterView.g5 ? 5 : 100)) {
                if (i11 < -9999) {
                    i11 = -9999;
                }
                chatActivityEnterView.S();
                NumberTextView numberTextView = chatActivityEnterView.U;
                numberTextView.a(i11, numberTextView.getVisibility() == 0);
                if (chatActivityEnterView.U.getVisibility() != 0) {
                    chatActivityEnterView.U.setVisibility(0);
                    chatActivityEnterView.U.setAlpha(0.0f);
                    chatActivityEnterView.U.setScaleX(0.5f);
                    chatActivityEnterView.U.setScaleY(0.5f);
                }
                chatActivityEnterView.U.animate().setListener(null).cancel();
                chatActivityEnterView.U.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                if (i11 >= 0) {
                    chatActivityEnterView.U.setTextColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.y6));
                    z10 = true;
                    if (chatActivityEnterView.l3 != z10) {
                        chatActivityEnterView.l3 = z10;
                        keVar.invalidate();
                    }
                    zeVar = chatActivityEnterView.i0;
                    if (zeVar != null) {
                    }
                    chatActivityEnterView.E();
                    if (chatActivityEnterView.V1) {
                        chatActivityEnterView.k0 = true;
                        if (this.e) {
                        }
                    }
                    chatActivityEnterView.o1(chatActivityEnterView.P <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                    chatActivityEnterView.G(true);
                    chatActivityEnterView.u1(chatActivityEnterView.P <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                }
                chatActivityEnterView.U.setTextColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.p7));
                z10 = false;
                if (chatActivityEnterView.l3 != z10 && (keVar = chatActivityEnterView.A1) != null) {
                    chatActivityEnterView.l3 = z10;
                    keVar.invalidate();
                }
                zeVar = chatActivityEnterView.i0;
                if (zeVar != null) {
                    zeVar.c();
                }
                chatActivityEnterView.E();
                if (chatActivityEnterView.V1 && !chatActivityEnterView.k0 && !MessagesController.getInstance(chatActivityEnterView.M).premiumFeaturesBlocked() && !UserConfig.getInstance(chatActivityEnterView.M).isPremium() && chatActivityEnterView.W > MessagesController.getInstance(chatActivityEnterView.M).captionLengthLimitDefault && chatActivityEnterView.W < MessagesController.getInstance(chatActivityEnterView.M).captionLengthLimitPremium) {
                    chatActivityEnterView.k0 = true;
                    if (this.e) {
                        chatActivityEnterView.p1();
                    } else {
                        AndroidUtilities.runOnUIThread(new bg(this, 19), 300L);
                    }
                }
                chatActivityEnterView.o1(chatActivityEnterView.P <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                chatActivityEnterView.G(true);
                chatActivityEnterView.u1(chatActivityEnterView.P <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
            }
        }
        NumberTextView numberTextView2 = chatActivityEnterView.U;
        if (numberTextView2 != null) {
            numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.am(this, 10));
        }
        z10 = true;
        if (chatActivityEnterView.l3 != z10) {
        }
        zeVar = chatActivityEnterView.i0;
        if (zeVar != null) {
        }
        chatActivityEnterView.E();
        if (chatActivityEnterView.V1) {
        }
        chatActivityEnterView.o1(chatActivityEnterView.P <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
        chatActivityEnterView.G(true);
        chatActivityEnterView.u1(chatActivityEnterView.P <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.d && this.f.A2) {
            this.c = charSequence.toString();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.d) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        qf qfVar = chatActivityEnterView.Q0;
        boolean z10 = (qfVar == null ? MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0) : qfVar.getCurrentPage()) != 0 && (chatActivityEnterView.E2 || chatActivityEnterView.F2);
        if (((i11 == 0 && !TextUtils.isEmpty(charSequence)) || (i11 != 0 && TextUtils.isEmpty(charSequence))) && z10) {
            chatActivityEnterView.c1(false, true);
        }
        if (chatActivityEnterView.P != chatActivityEnterView.A0.getLineCount()) {
            this.e = (chatActivityEnterView.A0.getLineCount() >= 4) != (chatActivityEnterView.P >= 4);
            if (!chatActivityEnterView.O && chatActivityEnterView.A0.getMeasuredWidth() > 0) {
                chatActivityEnterView.C0(chatActivityEnterView.P, chatActivityEnterView.A0.getLineCount());
            }
            int lineCount = chatActivityEnterView.A0.getLineCount();
            chatActivityEnterView.P = lineCount;
            chatActivityEnterView.o1((lineCount <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
            chatActivityEnterView.u1((chatActivityEnterView.P <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
        } else {
            this.e = false;
        }
        if (chatActivityEnterView.N2 == 1) {
            return;
        }
        if (chatActivityEnterView.w2 && !chatActivityEnterView.y0 && !chatActivityEnterView.z0 && !chatActivityEnterView.M2 && !chatActivityEnterView.S1 && chatActivityEnterView.U1 == null && i12 > i11 && charSequence.length() > 0 && charSequence.length() == i10 + i12 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            this.b = true;
        }
        chatActivityEnterView.S1 = false;
        chatActivityEnterView.K(true);
        CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence.toString());
        if (chatActivityEnterView.U2 != null && !chatActivityEnterView.M2) {
            int i13 = i12 + 1;
            if (i11 > i13 || i12 - i11 > 2 || TextUtils.isEmpty(charSequence)) {
                chatActivityEnterView.T2 = true;
            }
            chatActivityEnterView.U2.c1(charSequence, i11 > i13 || i12 - i11 > 2, false);
        }
        if (chatActivityEnterView.N2 != 2 && i12 - i11 > 1) {
            this.a = true;
        }
        if (chatActivityEnterView.U1 == null && !chatActivityEnterView.c2 && trimmedString.length() != 0 && chatActivityEnterView.x2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.M2) {
            chatActivityEnterView.x2 = System.currentTimeMillis();
            ag agVar = chatActivityEnterView.U2;
            if (agVar != null) {
                agVar.w1();
            }
        }
        chatActivityEnterView.Q1();
    }
}
