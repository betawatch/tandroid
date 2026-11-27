package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class b0 extends c79 {
    public final /* synthetic */ PremiumPreviewFragment c;

    public b0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 1 || i == 8;
    }

    @Override // j79
    public final int b() {
        return this.c.h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    @Override // j79
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
    @Override // j79
    public final void t(f89 f89Var, int i) {
        String str;
        View view = f89Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z = premiumPreviewFragment.i0;
        ?? r2 = premiumPreviewFragment.n;
        if (i >= r2 && i < premiumPreviewFragment.r) {
            ((yk8) view).a((sl8) premiumPreviewFragment.b.get(i - (r2 == true ? 1 : 0)), i != premiumPreviewFragment.r - 1);
            return;
        }
        int i2 = premiumPreviewFragment.w;
        if (i >= i2 && i < premiumPreviewFragment.x) {
            ((yk8) view).a((sl8) premiumPreviewFragment.c.get(i - i2), i != premiumPreviewFragment.x - 1);
            return;
        }
        if (i == premiumPreviewFragment.y) {
            ilb ilbVar = (ilb) view;
            ilbVar.setText("");
            ilbVar.setFixedSize(12);
            return;
        }
        if (i != premiumPreviewFragment.E && i != premiumPreviewFragment.F && i != premiumPreviewFragment.I) {
            if (i == premiumPreviewFragment.s) {
                ((mf5) view).setText(ob6.M0(2131746723, null));
                return;
            }
            if (i == premiumPreviewFragment.H) {
                ((mf5) view).setText(ob6.M0(2131745078, null));
                return;
            }
            if (i == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull Y1 = premiumPreviewFragment.getMessagesController().Y1(premiumPreviewFragment.getUserConfig().e());
                skb skbVar = (skb) view;
                String M0 = ob6.M0(2131745080, null);
                if (Y1 != null && !Y1.sponsored_enabled) {
                    r3 = false;
                }
                skbVar.l(M0, r3, false);
                return;
            }
            return;
        }
        ilb ilbVar2 = (ilb) view;
        if (!z) {
            ilbVar2.setTextColor(aob.p1(0.75f, -1));
            ilbVar2.getTextView().setLinkTextColor(-1);
            ilbVar2.setLinkTextRippleColor(Integer.valueOf(aob.p1(0.15f, -1)));
        }
        ilbVar2.setFixedSize(0);
        if (i == premiumPreviewFragment.I) {
            ilbVar2.setText(hl.D2(hl.N2(ob6.M0(2131745079, null), -1, 0, new uk8(this, (byte) 1), null), true));
            return;
        }
        if (i == premiumPreviewFragment.E) {
            if (premiumPreviewFragment.h0) {
                ilbVar2.setText(ob6.M0(2131746722, null));
                return;
            }
            TLRPC.TL_help_premiumPromo tL_help_premiumPromo = premiumPreviewFragment.getMediaDataController().E;
            if (tL_help_premiumPromo != null) {
                SpannableString spannableString = new SpannableString(tL_help_premiumPromo.status_text);
                ls6.h(tL_help_premiumPromo.status_entities, tL_help_premiumPromo.status_text, spannableString, -1);
                for (smb smbVar : (smb[]) spannableString.getSpans(0, spannableString.length(), smb.class)) {
                    rmb rmbVar = smbVar.b;
                    TLRPC.MessageEntity messageEntity = rmbVar.d;
                    if (messageEntity != null) {
                        String str2 = tL_help_premiumPromo.status_text;
                        int i3 = messageEntity.offset;
                        str = TextUtils.substring(str2, i3, messageEntity.length + i3);
                    } else {
                        str = null;
                    }
                    TLRPC.MessageEntity messageEntity2 = rmbVar.d;
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                        spannableString.setSpan(new c8c(str, 0, rmbVar), rmbVar.b, rmbVar.c, 33);
                    } else if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                        spannableString.setSpan(new f8c(str, rmbVar), rmbVar.b, rmbVar.c, 33);
                    } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                        spannableString.setSpan(new h8c(c00.i("mailto:", str), rmbVar), rmbVar.b, rmbVar.c, 33);
                    } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                        if (str.toLowerCase().contains("://")) {
                            spannableString.setSpan(new d8c(str, rmbVar), rmbVar.b, rmbVar.c, 33);
                        } else {
                            spannableString.setSpan(new d8c("http://".concat(str), rmbVar), rmbVar.b, rmbVar.c, 33);
                        }
                    } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                        spannableString.setSpan(new f8c(c00.i("card:", str), rmbVar), rmbVar.b, rmbVar.c, 33);
                    } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                        String h = f78.h(str, false);
                        if (str.startsWith("+")) {
                            h = c00.i("+", h);
                        }
                        spannableString.setSpan(new d8c(c00.i("tel:", h), rmbVar), rmbVar.b, rmbVar.c, 33);
                    } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                        h8c h8cVar = new h8c(rmbVar.d.url, rmbVar);
                        h8cVar.b = true;
                        spannableString.setSpan(h8cVar, rmbVar.b, rmbVar.c, 33);
                        if (!z) {
                            spannableString.setSpan(new y7c(hl.o()), rmbVar.b, rmbVar.c, 33);
                        }
                    } else if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                        spannableString.setSpan(new i8c(String.valueOf(((TLRPC.TL_messageEntityMentionName) rmbVar.d).user_id), 0, rmbVar), rmbVar.b, rmbVar.c, 33);
                    } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                        spannableString.setSpan(new i8c(String.valueOf(((TLRPC.TL_inputMessageEntityMentionName) rmbVar.d).user_id.user_id), 0, rmbVar), rmbVar.b, rmbVar.c, 33);
                    } else if ((rmbVar.a & 4) != 0) {
                        spannableString.setSpan(new e8c(spannableString, rmbVar.b, rmbVar.c, (byte) 0, rmbVar), rmbVar.b, rmbVar.c, 33);
                    } else {
                        spannableString.setSpan(new smb(rmbVar, 0), rmbVar.b, rmbVar.c, 33);
                    }
                    if ((rmbVar.a & 256) != 0) {
                        spannableString.setSpan(new smb(rmbVar, 0), rmbVar.b, rmbVar.c, 33);
                    }
                }
                ilbVar2.setText(spannableString);
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View jl8Var;
        View rcaVar;
        vnb vnbVar;
        Context context = viewGroup.getContext();
        switch (i) {
            case 1:
                jl8Var = new jl8(this, context);
                break;
            case 2:
                rcaVar = new rca(context, 0, 0);
                jl8Var = rcaVar;
                break;
            case 3:
            default:
                jl8Var = new tb((byte) 28, context, this);
                jl8Var.setTag(-33024);
                break;
            case 4:
                rcaVar = new u1(context, (byte) 0);
                jl8Var = rcaVar;
                break;
            case 5:
                jl8Var = new ilb(context);
                break;
            case 6:
                jl8Var = new View(context);
                jl8Var.setTag(-33024);
                break;
            case 7:
                jl8Var = new mf5(context);
                break;
            case 8:
                vnbVar = ((org.telegram.ui.ActionBar.e) this.c).resourceProvider;
                jl8Var = new skb(23, vnbVar, context, false, true);
                break;
        }
        return qu6.h(jl8Var, jl8Var, -1, -2);
    }
}
