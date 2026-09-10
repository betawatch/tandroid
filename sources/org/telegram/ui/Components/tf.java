package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tf implements TextWatcher {
    public boolean a;
    public boolean b;
    public String c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ ChatActivityEnterView f;

    public tf(ChatActivityEnterView chatActivityEnterView) {
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
        pf pfVar;
        ye yeVar;
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
        if (chatActivityEnterView.R2 == 0) {
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
            if (i11 <= (chatActivityEnterView.k5 ? 5 : 100)) {
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
                    if (chatActivityEnterView.p3 != z10) {
                        chatActivityEnterView.p3 = z10;
                        yeVar.invalidate();
                    }
                    pfVar = chatActivityEnterView.m0;
                    if (pfVar != null) {
                    }
                    chatActivityEnterView.D();
                    if (chatActivityEnterView.Z1) {
                        chatActivityEnterView.o0 = true;
                        if (this.e) {
                        }
                    }
                    chatActivityEnterView.p1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                    chatActivityEnterView.F(true);
                    chatActivityEnterView.v1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                }
                chatActivityEnterView.b0.setTextColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.p7));
                z10 = false;
                if (chatActivityEnterView.p3 != z10 && (yeVar = chatActivityEnterView.E1) != null) {
                    chatActivityEnterView.p3 = z10;
                    yeVar.invalidate();
                }
                pfVar = chatActivityEnterView.m0;
                if (pfVar != null) {
                    pfVar.c();
                }
                chatActivityEnterView.D();
                if (chatActivityEnterView.Z1 && !chatActivityEnterView.o0 && !MessagesController.getInstance(chatActivityEnterView.Q).premiumFeaturesBlocked() && !UserConfig.getInstance(chatActivityEnterView.Q).isPremium() && chatActivityEnterView.d0 > MessagesController.getInstance(chatActivityEnterView.Q).captionLengthLimitDefault && chatActivityEnterView.d0 < MessagesController.getInstance(chatActivityEnterView.Q).captionLengthLimitPremium) {
                    chatActivityEnterView.o0 = true;
                    if (this.e) {
                        chatActivityEnterView.q1();
                    } else {
                        AndroidUtilities.runOnUIThread(new rg(this, 19), 300L);
                    }
                }
                chatActivityEnterView.p1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                chatActivityEnterView.F(true);
                chatActivityEnterView.v1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
            }
        }
        NumberTextView numberTextView2 = chatActivityEnterView.b0;
        if (numberTextView2 != null) {
            numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.Cells.v5(this, 22));
        }
        z10 = true;
        if (chatActivityEnterView.p3 != z10) {
        }
        pfVar = chatActivityEnterView.m0;
        if (pfVar != null) {
        }
        chatActivityEnterView.D();
        if (chatActivityEnterView.Z1) {
        }
        chatActivityEnterView.p1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
        chatActivityEnterView.F(true);
        chatActivityEnterView.v1(chatActivityEnterView.T <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.d && this.f.E2) {
            this.c = charSequence.toString();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.d) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        fg fgVar = chatActivityEnterView.U0;
        boolean z10 = (fgVar == null ? MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0) : fgVar.getCurrentPage()) != 0 && (chatActivityEnterView.I2 || chatActivityEnterView.J2);
        if (((i11 == 0 && !TextUtils.isEmpty(charSequence)) || (i11 != 0 && TextUtils.isEmpty(charSequence))) && z10) {
            chatActivityEnterView.d1(false, true);
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
        if (chatActivityEnterView.R2 == 1) {
            return;
        }
        if (chatActivityEnterView.A2 && !chatActivityEnterView.C0 && !chatActivityEnterView.D0 && !chatActivityEnterView.Q2 && !chatActivityEnterView.W1 && chatActivityEnterView.Y1 == null && i12 > i11 && charSequence.length() > 0 && charSequence.length() == i10 + i12 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            this.b = true;
        }
        chatActivityEnterView.W1 = false;
        chatActivityEnterView.K(true);
        CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence.toString());
        if (chatActivityEnterView.Y2 != null && !chatActivityEnterView.Q2) {
            int i13 = i12 + 1;
            if (i11 > i13 || i12 - i11 > 2 || TextUtils.isEmpty(charSequence)) {
                chatActivityEnterView.X2 = true;
            }
            chatActivityEnterView.Y2.k1(charSequence, i11 > i13 || i12 - i11 > 2, false);
        }
        if (chatActivityEnterView.R2 != 2 && i12 - i11 > 1) {
            this.a = true;
        }
        if (chatActivityEnterView.Y1 == null && !chatActivityEnterView.g2 && trimmedString.length() != 0 && chatActivityEnterView.B2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.Q2) {
            chatActivityEnterView.B2 = System.currentTimeMillis();
            qg qgVar = chatActivityEnterView.Y2;
            if (qgVar != null) {
                qgVar.D1();
            }
        }
        chatActivityEnterView.R1();
    }
}
