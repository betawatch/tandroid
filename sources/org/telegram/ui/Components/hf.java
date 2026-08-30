package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        boolean z4;
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
        if (chatActivityEnterView.O2 == 0) {
            if (this.b) {
                chatActivityEnterView.S0();
                this.b = false;
            }
            if (this.a) {
                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                    editable.removeSpan(imageSpan);
                }
                Emoji.replaceEmoji((CharSequence) editable, chatActivityEnterView.B0.getPaint().getFontMetricsInt(), false, (int[]) null);
                this.a = false;
            }
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        chatActivityEnterView.a0 = codePointCount;
        int i10 = chatActivityEnterView.W;
        if (i10 > 0) {
            int i11 = i10 - codePointCount;
            if (i11 <= (chatActivityEnterView.h5 ? 5 : 100)) {
                if (i11 < -9999) {
                    i11 = -9999;
                }
                chatActivityEnterView.S();
                NumberTextView numberTextView = chatActivityEnterView.V;
                numberTextView.a(i11, numberTextView.getVisibility() == 0);
                if (chatActivityEnterView.V.getVisibility() != 0) {
                    chatActivityEnterView.V.setVisibility(0);
                    chatActivityEnterView.V.setAlpha(0.0f);
                    chatActivityEnterView.V.setScaleX(0.5f);
                    chatActivityEnterView.V.setScaleY(0.5f);
                }
                chatActivityEnterView.V.animate().setListener(null).cancel();
                chatActivityEnterView.V.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                if (i11 >= 0) {
                    chatActivityEnterView.V.setTextColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.y6));
                    z4 = true;
                    if (chatActivityEnterView.m3 != z4) {
                        chatActivityEnterView.m3 = z4;
                        oeVar.invalidate();
                    }
                    dfVar = chatActivityEnterView.j0;
                    if (dfVar != null) {
                    }
                    chatActivityEnterView.D();
                    if (chatActivityEnterView.W1) {
                        chatActivityEnterView.l0 = true;
                        if (this.e) {
                        }
                    }
                    chatActivityEnterView.p1(chatActivityEnterView.Q <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                    chatActivityEnterView.F(true);
                    chatActivityEnterView.v1(chatActivityEnterView.Q <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                }
                chatActivityEnterView.V.setTextColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.p7));
                z4 = false;
                if (chatActivityEnterView.m3 != z4 && (oeVar = chatActivityEnterView.B1) != null) {
                    chatActivityEnterView.m3 = z4;
                    oeVar.invalidate();
                }
                dfVar = chatActivityEnterView.j0;
                if (dfVar != null) {
                    dfVar.c();
                }
                chatActivityEnterView.D();
                if (chatActivityEnterView.W1 && !chatActivityEnterView.l0 && !MessagesController.getInstance(chatActivityEnterView.N).premiumFeaturesBlocked() && !UserConfig.getInstance(chatActivityEnterView.N).isPremium() && chatActivityEnterView.a0 > MessagesController.getInstance(chatActivityEnterView.N).captionLengthLimitDefault && chatActivityEnterView.a0 < MessagesController.getInstance(chatActivityEnterView.N).captionLengthLimitPremium) {
                    chatActivityEnterView.l0 = true;
                    if (this.e) {
                        chatActivityEnterView.q1();
                    } else {
                        AndroidUtilities.runOnUIThread(new fg(this, 19), 300L);
                    }
                }
                chatActivityEnterView.p1(chatActivityEnterView.Q <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                chatActivityEnterView.F(true);
                chatActivityEnterView.v1(chatActivityEnterView.Q <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
            }
        }
        NumberTextView numberTextView2 = chatActivityEnterView.V;
        if (numberTextView2 != null) {
            numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new a9(this, 1));
        }
        z4 = true;
        if (chatActivityEnterView.m3 != z4) {
        }
        dfVar = chatActivityEnterView.j0;
        if (dfVar != null) {
        }
        chatActivityEnterView.D();
        if (chatActivityEnterView.W1) {
        }
        chatActivityEnterView.p1(chatActivityEnterView.Q <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
        chatActivityEnterView.F(true);
        chatActivityEnterView.v1(chatActivityEnterView.Q <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.d && this.f.B2) {
            this.c = charSequence.toString();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.d) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        uf ufVar = chatActivityEnterView.R0;
        boolean z4 = (ufVar == null ? MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0) : ufVar.getCurrentPage()) != 0 && (chatActivityEnterView.F2 || chatActivityEnterView.G2);
        if (((i11 == 0 && !TextUtils.isEmpty(charSequence)) || (i11 != 0 && TextUtils.isEmpty(charSequence))) && z4) {
            chatActivityEnterView.d1(false, true);
        }
        if (chatActivityEnterView.Q != chatActivityEnterView.B0.getLineCount()) {
            this.e = (chatActivityEnterView.B0.getLineCount() >= 4) != (chatActivityEnterView.Q >= 4);
            if (!chatActivityEnterView.P && chatActivityEnterView.B0.getMeasuredWidth() > 0) {
                chatActivityEnterView.C0(chatActivityEnterView.Q, chatActivityEnterView.B0.getLineCount());
            }
            int lineCount = chatActivityEnterView.B0.getLineCount();
            chatActivityEnterView.Q = lineCount;
            chatActivityEnterView.p1((lineCount <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
            chatActivityEnterView.v1((chatActivityEnterView.Q <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
        } else {
            this.e = false;
        }
        if (chatActivityEnterView.O2 == 1) {
            return;
        }
        if (chatActivityEnterView.x2 && !chatActivityEnterView.z0 && !chatActivityEnterView.A0 && !chatActivityEnterView.N2 && !chatActivityEnterView.T1 && chatActivityEnterView.V1 == null && i12 > i11 && charSequence.length() > 0 && charSequence.length() == i10 + i12 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            this.b = true;
        }
        chatActivityEnterView.T1 = false;
        chatActivityEnterView.J(true);
        CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence.toString());
        if (chatActivityEnterView.V2 != null && !chatActivityEnterView.N2) {
            int i13 = i12 + 1;
            if (i11 > i13 || i12 - i11 > 2 || TextUtils.isEmpty(charSequence)) {
                chatActivityEnterView.U2 = true;
            }
            chatActivityEnterView.V2.n1(charSequence, i11 > i13 || i12 - i11 > 2, false);
        }
        if (chatActivityEnterView.O2 != 2 && i12 - i11 > 1) {
            this.a = true;
        }
        if (chatActivityEnterView.V1 == null && !chatActivityEnterView.d2 && trimmedString.length() != 0 && chatActivityEnterView.y2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.N2) {
            chatActivityEnterView.y2 = System.currentTimeMillis();
            eg egVar = chatActivityEnterView.V2;
            if (egVar != null) {
                egVar.H1();
            }
        }
        chatActivityEnterView.R1();
    }
}
