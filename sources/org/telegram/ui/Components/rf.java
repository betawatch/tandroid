package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rf implements TextWatcher {
    public boolean a;
    public boolean b;
    public String c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ ChatActivityEnterView f;

    public rf(ChatActivityEnterView chatActivityEnterView) {
        this.f = chatActivityEnterView;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0191  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        nf nfVar;
        xe xeVar;
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
                Emoji.replaceEmoji((CharSequence) editable, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                this.a = false;
            }
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        chatActivityEnterView.d0 = codePointCount;
        int i10 = chatActivityEnterView.c0;
        if (i10 > 0) {
            int i11 = i10 - codePointCount;
            if (i11 <= (chatActivityEnterView.l5 ? 5 : 100)) {
                if (i11 < -9999) {
                    i11 = -9999;
                }
                chatActivityEnterView.S();
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
                    chatActivityEnterView.b0.setTextColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.y6));
                    z10 = true;
                    if (chatActivityEnterView.q3 != z10) {
                        chatActivityEnterView.q3 = z10;
                        xeVar.invalidate();
                    }
                    nfVar = chatActivityEnterView.m0;
                    if (nfVar != null) {
                    }
                    chatActivityEnterView.D();
                    if (chatActivityEnterView.a2) {
                        chatActivityEnterView.o0 = true;
                        if (this.e) {
                        }
                    }
                    chatActivityEnterView.o1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                    chatActivityEnterView.F(true);
                    chatActivityEnterView.u1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                }
                chatActivityEnterView.b0.setTextColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.p7));
                z10 = false;
                if (chatActivityEnterView.q3 != z10 && (xeVar = chatActivityEnterView.F1) != null) {
                    chatActivityEnterView.q3 = z10;
                    xeVar.invalidate();
                }
                nfVar = chatActivityEnterView.m0;
                if (nfVar != null) {
                    nfVar.c();
                }
                chatActivityEnterView.D();
                if (chatActivityEnterView.a2 && !chatActivityEnterView.o0 && !MessagesController.getInstance(chatActivityEnterView.Q).premiumFeaturesBlocked() && !UserConfig.getInstance(chatActivityEnterView.Q).isPremium() && chatActivityEnterView.d0 > MessagesController.getInstance(chatActivityEnterView.Q).captionLengthLimitDefault && chatActivityEnterView.d0 < MessagesController.getInstance(chatActivityEnterView.Q).captionLengthLimitPremium) {
                    chatActivityEnterView.o0 = true;
                    if (this.e) {
                        chatActivityEnterView.p1();
                    } else {
                        AndroidUtilities.runOnUIThread(new og(this, 19), 300L);
                    }
                }
                chatActivityEnterView.o1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                chatActivityEnterView.F(true);
                chatActivityEnterView.u1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
            }
        }
        NumberTextView numberTextView2 = chatActivityEnterView.b0;
        if (numberTextView2 != null) {
            numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new q8(this, 2));
        }
        z10 = true;
        if (chatActivityEnterView.q3 != z10) {
        }
        nfVar = chatActivityEnterView.m0;
        if (nfVar != null) {
        }
        chatActivityEnterView.D();
        if (chatActivityEnterView.a2) {
        }
        chatActivityEnterView.o1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
        chatActivityEnterView.F(true);
        chatActivityEnterView.u1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
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
        dg dgVar = chatActivityEnterView.U0;
        boolean z10 = (dgVar == null ? MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0) : dgVar.getCurrentPage()) != 0 && (chatActivityEnterView.J2 || chatActivityEnterView.K2);
        if (((i11 == 0 && !TextUtils.isEmpty(charSequence)) || (i11 != 0 && TextUtils.isEmpty(charSequence))) && z10) {
            chatActivityEnterView.c1(false, true);
        }
        if (chatActivityEnterView.T != chatActivityEnterView.E0.getLineCount()) {
            this.e = (chatActivityEnterView.E0.getLineCount() >= 4) != (chatActivityEnterView.T >= 4);
            if (!chatActivityEnterView.S && chatActivityEnterView.E0.getMeasuredWidth() > 0) {
                chatActivityEnterView.C0(chatActivityEnterView.T, chatActivityEnterView.E0.getLineCount());
            }
            int lineCount = chatActivityEnterView.E0.getLineCount();
            chatActivityEnterView.T = lineCount;
            chatActivityEnterView.o1((lineCount <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
            chatActivityEnterView.u1((chatActivityEnterView.T <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
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
        chatActivityEnterView.K(true);
        CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence.toString());
        if (chatActivityEnterView.Z2 != null && !chatActivityEnterView.R2) {
            int i13 = i12 + 1;
            if (i11 > i13 || i12 - i11 > 2 || TextUtils.isEmpty(charSequence)) {
                chatActivityEnterView.Y2 = true;
            }
            chatActivityEnterView.Z2.m1(charSequence, i11 > i13 || i12 - i11 > 2, false);
        }
        if (chatActivityEnterView.S2 != 2 && i12 - i11 > 1) {
            this.a = true;
        }
        if (chatActivityEnterView.Z1 == null && !chatActivityEnterView.h2 && trimmedString.length() != 0 && chatActivityEnterView.C2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.R2) {
            chatActivityEnterView.C2 = System.currentTimeMillis();
            ng ngVar = chatActivityEnterView.Z2;
            if (ngVar != null) {
                ngVar.F1();
            }
        }
        chatActivityEnterView.R1();
    }
}
