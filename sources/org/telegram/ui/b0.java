package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class b0 extends n39 {
    public final /* synthetic */ PremiumPreviewFragment c;

    public b0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 1 || i == 8;
    }

    @Override // w39
    public final int b() {
        return this.c.h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        if (i >= premiumPreviewFragment.n && i < premiumPreviewFragment.r) {
            return 1;
        }
        if (i >= premiumPreviewFragment.w && i < premiumPreviewFragment.x) {
            return 1;
        }
        if (i == 0) {
            return 4;
        }
        if (i == premiumPreviewFragment.y || i == premiumPreviewFragment.E || i == premiumPreviewFragment.F || i == premiumPreviewFragment.I) {
            return 5;
        }
        if (i == premiumPreviewFragment.G) {
            return 6;
        }
        if (i == premiumPreviewFragment.s || i == premiumPreviewFragment.H) {
            return 7;
        }
        return i == premiumPreviewFragment.showAdsRow ? 8 : 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    @Override // w39
    public final void t(s49 s49Var, int i) {
        String str;
        View view = s49Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z = premiumPreviewFragment.i0;
        ?? r2 = premiumPreviewFragment.n;
        if (i >= r2 && i < premiumPreviewFragment.r) {
            ((kh8) view).a((fi8) premiumPreviewFragment.b.get(i - (r2 == true ? 1 : 0)), i != premiumPreviewFragment.r - 1);
            return;
        }
        int i2 = premiumPreviewFragment.w;
        if (i >= i2 && i < premiumPreviewFragment.x) {
            ((kh8) view).a((fi8) premiumPreviewFragment.c.get(i - i2), i != premiumPreviewFragment.x - 1);
            return;
        }
        if (i == premiumPreviewFragment.y) {
            mhb mhbVar = (mhb) view;
            mhbVar.setText("");
            mhbVar.setFixedSize(12);
            return;
        }
        if (i != premiumPreviewFragment.E && i != premiumPreviewFragment.F && i != premiumPreviewFragment.I) {
            if (i == premiumPreviewFragment.s) {
                ((ld5) view).setText(k96.M0(2131746803, null));
                return;
            }
            if (i == premiumPreviewFragment.H) {
                ((ld5) view).setText(k96.M0(2131745158, null));
                return;
            }
            if (i == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull W1 = premiumPreviewFragment.getMessagesController().W1(premiumPreviewFragment.getUserConfig().e());
                wgb wgbVar = (wgb) view;
                String M0 = k96.M0(2131745160, null);
                if (W1 != null && !W1.sponsored_enabled) {
                    r3 = false;
                }
                wgbVar.l(M0, r3, false);
                return;
            }
            return;
        }
        mhb mhbVar2 = (mhb) view;
        if (!z) {
            mhbVar2.setTextColor(bkb.p1(0.75f, -1));
            mhbVar2.getTextView().setLinkTextColor(-1);
            mhbVar2.setLinkTextRippleColor(Integer.valueOf(bkb.p1(0.15f, -1)));
        }
        mhbVar2.setFixedSize(0);
        if (i == premiumPreviewFragment.I) {
            mhbVar2.setText(gl.E2(gl.O2(k96.M0(2131745159, null), -1, 0, new w88(this, (byte) 16), null), true));
            return;
        }
        if (i == premiumPreviewFragment.E) {
            if (premiumPreviewFragment.h0) {
                mhbVar2.setText(k96.M0(2131746802, null));
                return;
            }
            TLRPC.TL_help_premiumPromo tL_help_premiumPromo = premiumPreviewFragment.getMediaDataController().E;
            if (tL_help_premiumPromo != null) {
                SpannableString spannableString = new SpannableString(tL_help_premiumPromo.status_text);
                hq6.h(tL_help_premiumPromo.status_entities, tL_help_premiumPromo.status_text, spannableString, -1);
                for (wib wibVar : (wib[]) spannableString.getSpans(0, spannableString.length(), wib.class)) {
                    vib vibVar = wibVar.b;
                    TLRPC.MessageEntity messageEntity = vibVar.d;
                    if (messageEntity != null) {
                        String str2 = tL_help_premiumPromo.status_text;
                        int i3 = messageEntity.offset;
                        str = TextUtils.substring(str2, i3, messageEntity.length + i3);
                    } else {
                        str = null;
                    }
                    TLRPC.MessageEntity messageEntity2 = vibVar.d;
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                        spannableString.setSpan(new d4c(str, 0, vibVar), vibVar.b, vibVar.c, 33);
                    } else if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                        spannableString.setSpan(new g4c(str, vibVar), vibVar.b, vibVar.c, 33);
                    } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                        spannableString.setSpan(new i4c(b00.h("mailto:", str), vibVar), vibVar.b, vibVar.c, 33);
                    } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                        if (str.toLowerCase().contains("://")) {
                            spannableString.setSpan(new e4c(str, vibVar), vibVar.b, vibVar.c, 33);
                        } else {
                            spannableString.setSpan(new e4c("http://".concat(str), vibVar), vibVar.b, vibVar.c, 33);
                        }
                    } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                        spannableString.setSpan(new g4c(b00.h("card:", str), vibVar), vibVar.b, vibVar.c, 33);
                    } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                        String h = p38.h(str, false);
                        if (str.startsWith("+")) {
                            h = b00.h("+", h);
                        }
                        spannableString.setSpan(new e4c(b00.h("tel:", h), vibVar), vibVar.b, vibVar.c, 33);
                    } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                        i4c i4cVar = new i4c(vibVar.d.url, vibVar);
                        i4cVar.b = true;
                        spannableString.setSpan(i4cVar, vibVar.b, vibVar.c, 33);
                        if (!z) {
                            spannableString.setSpan(new z3c(gl.o()), vibVar.b, vibVar.c, 33);
                        }
                    } else if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                        spannableString.setSpan(new j4c(String.valueOf(((TLRPC.TL_messageEntityMentionName) vibVar.d).user_id), 0, vibVar), vibVar.b, vibVar.c, 33);
                    } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                        spannableString.setSpan(new j4c(String.valueOf(((TLRPC.TL_inputMessageEntityMentionName) vibVar.d).user_id.user_id), 0, vibVar), vibVar.b, vibVar.c, 33);
                    } else if ((vibVar.a & 4) != 0) {
                        spannableString.setSpan(new f4c(spannableString, vibVar.b, vibVar.c, (byte) 0, vibVar), vibVar.b, vibVar.c, 33);
                    } else {
                        spannableString.setSpan(new wib(vibVar, 0), vibVar.b, vibVar.c, 33);
                    }
                    if ((vibVar.a & 256) != 0) {
                        spannableString.setSpan(new wib(vibVar, 0), vibVar.b, vibVar.c, 33);
                    }
                }
                mhbVar2.setText(spannableString);
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View wh8Var;
        View b9aVar;
        wjb wjbVar;
        Context context = viewGroup.getContext();
        switch (i) {
            case 1:
                wh8Var = new wh8(this, context);
                break;
            case 2:
                b9aVar = new b9a(context, 0, 0);
                wh8Var = b9aVar;
                break;
            case 3:
            default:
                wh8Var = new sb((byte) 27, context, this);
                wh8Var.setTag(-33024);
                break;
            case 4:
                b9aVar = new t1(context, (byte) 0);
                wh8Var = b9aVar;
                break;
            case 5:
                wh8Var = new mhb(context);
                break;
            case 6:
                wh8Var = new View(context);
                wh8Var.setTag(-33024);
                break;
            case 7:
                wh8Var = new ld5(context);
                break;
            case 8:
                wjbVar = ((org.telegram.ui.ActionBar.d) this.c).resourceProvider;
                wh8Var = new wgb(23, wjbVar, context, false, true);
                break;
        }
        return ls6.h(wh8Var, wh8Var, -1, -2);
    }
}
