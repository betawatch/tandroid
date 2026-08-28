package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hf implements TextWatcher {
    public boolean a;
    public boolean b;
    public String c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ ChatActivityEnterView f;

    public hf(ChatActivityEnterView chatActivityEnterView) {
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
        df dfVar;
        oe oeVar;
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
        int i9 = chatActivityEnterView.V;
        if (i9 > 0) {
            int i10 = i9 - codePointCount;
            if (i10 <= (chatActivityEnterView.g5 ? 5 : 100)) {
                if (i10 < -9999) {
                    i10 = -9999;
                }
                chatActivityEnterView.R();
                NumberTextView numberTextView = chatActivityEnterView.U;
                numberTextView.a(i10, numberTextView.getVisibility() == 0);
                if (chatActivityEnterView.U.getVisibility() != 0) {
                    chatActivityEnterView.U.setVisibility(0);
                    chatActivityEnterView.U.setAlpha(0.0f);
                    chatActivityEnterView.U.setScaleX(0.5f);
                    chatActivityEnterView.U.setScaleY(0.5f);
                }
                chatActivityEnterView.U.animate().setListener(null).cancel();
                chatActivityEnterView.U.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                if (i10 >= 0) {
                    chatActivityEnterView.U.setTextColor(chatActivityEnterView.h0(org.telegram.ui.ActionBar.f6.y6));
                    z10 = true;
                    if (chatActivityEnterView.l3 != z10) {
                        chatActivityEnterView.l3 = z10;
                        oeVar.invalidate();
                    }
                    dfVar = chatActivityEnterView.i0;
                    if (dfVar != null) {
                    }
                    chatActivityEnterView.D();
                    if (chatActivityEnterView.V1) {
                        chatActivityEnterView.k0 = true;
                        if (this.e) {
                        }
                    }
                    chatActivityEnterView.p1(chatActivityEnterView.P <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                    chatActivityEnterView.F(true);
                    chatActivityEnterView.v1(chatActivityEnterView.P <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                }
                chatActivityEnterView.U.setTextColor(chatActivityEnterView.h0(org.telegram.ui.ActionBar.f6.p7));
                z10 = false;
                if (chatActivityEnterView.l3 != z10 && (oeVar = chatActivityEnterView.A1) != null) {
                    chatActivityEnterView.l3 = z10;
                    oeVar.invalidate();
                }
                dfVar = chatActivityEnterView.i0;
                if (dfVar != null) {
                    dfVar.c();
                }
                chatActivityEnterView.D();
                if (chatActivityEnterView.V1 && !chatActivityEnterView.k0 && !MessagesController.getInstance(chatActivityEnterView.M).premiumFeaturesBlocked() && !UserConfig.getInstance(chatActivityEnterView.M).isPremium() && chatActivityEnterView.W > MessagesController.getInstance(chatActivityEnterView.M).captionLengthLimitDefault && chatActivityEnterView.W < MessagesController.getInstance(chatActivityEnterView.M).captionLengthLimitPremium) {
                    chatActivityEnterView.k0 = true;
                    if (this.e) {
                        chatActivityEnterView.q1();
                    } else {
                        AndroidUtilities.runOnUIThread(new fg(this, 19), 300L);
                    }
                }
                chatActivityEnterView.p1(chatActivityEnterView.P <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                chatActivityEnterView.F(true);
                chatActivityEnterView.v1(chatActivityEnterView.P <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
            }
        }
        NumberTextView numberTextView2 = chatActivityEnterView.U;
        if (numberTextView2 != null) {
            numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.xp(this, 8));
        }
        z10 = true;
        if (chatActivityEnterView.l3 != z10) {
        }
        dfVar = chatActivityEnterView.i0;
        if (dfVar != null) {
        }
        chatActivityEnterView.D();
        if (chatActivityEnterView.V1) {
        }
        chatActivityEnterView.p1(chatActivityEnterView.P <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
        chatActivityEnterView.F(true);
        chatActivityEnterView.v1(chatActivityEnterView.P <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        if (!this.d && this.f.A2) {
            this.c = charSequence.toString();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        if (this.d) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        uf ufVar = chatActivityEnterView.Q0;
        boolean z10 = (ufVar == null ? MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0) : ufVar.getCurrentPage()) != 0 && (chatActivityEnterView.E2 || chatActivityEnterView.F2);
        if (((i10 == 0 && !TextUtils.isEmpty(charSequence)) || (i10 != 0 && TextUtils.isEmpty(charSequence))) && z10) {
            chatActivityEnterView.d1(false, true);
        }
        if (chatActivityEnterView.P != chatActivityEnterView.A0.getLineCount()) {
            this.e = (chatActivityEnterView.A0.getLineCount() >= 4) != (chatActivityEnterView.P >= 4);
            if (!chatActivityEnterView.O && chatActivityEnterView.A0.getMeasuredWidth() > 0) {
                chatActivityEnterView.B0(chatActivityEnterView.P, chatActivityEnterView.A0.getLineCount());
            }
            int lineCount = chatActivityEnterView.A0.getLineCount();
            chatActivityEnterView.P = lineCount;
            chatActivityEnterView.p1((lineCount <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
            chatActivityEnterView.v1((chatActivityEnterView.P <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
        } else {
            this.e = false;
        }
        if (chatActivityEnterView.N2 == 1) {
            return;
        }
        if (chatActivityEnterView.w2 && !chatActivityEnterView.y0 && !chatActivityEnterView.z0 && !chatActivityEnterView.M2 && !chatActivityEnterView.S1 && chatActivityEnterView.U1 == null && i11 > i10 && charSequence.length() > 0 && charSequence.length() == i9 + i11 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            this.b = true;
        }
        chatActivityEnterView.S1 = false;
        chatActivityEnterView.J(true);
        CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence.toString());
        if (chatActivityEnterView.U2 != null && !chatActivityEnterView.M2) {
            int i12 = i11 + 1;
            if (i10 > i12 || i11 - i10 > 2 || TextUtils.isEmpty(charSequence)) {
                chatActivityEnterView.T2 = true;
            }
            chatActivityEnterView.U2.b1(charSequence, i10 > i12 || i11 - i10 > 2, false);
        }
        if (chatActivityEnterView.N2 != 2 && i11 - i10 > 1) {
            this.a = true;
        }
        if (chatActivityEnterView.U1 == null && !chatActivityEnterView.c2 && trimmedString.length() != 0 && chatActivityEnterView.x2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.M2) {
            chatActivityEnterView.x2 = System.currentTimeMillis();
            eg egVar = chatActivityEnterView.U2;
            if (egVar != null) {
                egVar.u1();
            }
        }
        chatActivityEnterView.R1();
    }
}
