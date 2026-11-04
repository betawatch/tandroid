package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fs0 extends org.telegram.ui.Components.sj0 {
    public final /* synthetic */ PremiumPreviewFragment c;

    public fs0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 1 || i3 == 8;
    }

    @Override // u4.h0
    public final int b() {
        return this.c.h;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        if (i3 >= premiumPreviewFragment.n && i3 < premiumPreviewFragment.r) {
            return 1;
        }
        if (i3 >= premiumPreviewFragment.w && i3 < premiumPreviewFragment.x) {
            return 1;
        }
        if (i3 == 0) {
            return 4;
        }
        if (i3 == premiumPreviewFragment.y || i3 == premiumPreviewFragment.E || i3 == premiumPreviewFragment.F || i3 == premiumPreviewFragment.I) {
            return 5;
        }
        if (i3 == premiumPreviewFragment.G) {
            return 6;
        }
        if (i3 == premiumPreviewFragment.s || i3 == premiumPreviewFragment.H) {
            return 7;
        }
        return i3 == premiumPreviewFragment.showAdsRow ? 8 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x02ac  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        String str;
        int i10;
        boolean z10;
        View view = d1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z11 = premiumPreviewFragment.i0;
        int i11 = premiumPreviewFragment.n;
        boolean z12 = false;
        if (i3 >= i11 && i3 < premiumPreviewFragment.r) {
            ((yr0) view).a((ls0) premiumPreviewFragment.b.get(i3 - i11), i3 != premiumPreviewFragment.r - 1);
            return;
        }
        int i12 = premiumPreviewFragment.w;
        if (i3 >= i12 && i3 < premiumPreviewFragment.x) {
            ((yr0) view).a((ls0) premiumPreviewFragment.c.get(i3 - i12), i3 != premiumPreviewFragment.x - 1);
            return;
        }
        if (i3 == premiumPreviewFragment.y) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setText("");
            y8Var.setFixedSize(12);
            return;
        }
        String str2 = null;
        if (i3 != premiumPreviewFragment.E && i3 != premiumPreviewFragment.F && i3 != premiumPreviewFragment.I) {
            if (i3 == premiumPreviewFragment.s) {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.bd.M0(2131747002, null));
                return;
            }
            if (i3 == premiumPreviewFragment.H) {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.bd.M0(2131745360, null));
                return;
            }
            if (i3 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull b22 = premiumPreviewFragment.getMessagesController().b2(premiumPreviewFragment.getUserConfig().e());
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                String M0 = org.telegram.messenger.bd.M0(2131745362, null);
                if (b22 != null && !b22.sponsored_enabled) {
                    r6 = false;
                }
                l8Var.l(M0, r6, false);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.y8 y8Var2 = (org.telegram.ui.Cells.y8) view;
        if (!z11) {
            y8Var2.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
            y8Var2.getTextView().setLinkTextColor(-1);
            y8Var2.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.15f, -1)));
        }
        y8Var2.setFixedSize(0);
        if (i3 == premiumPreviewFragment.I) {
            y8Var2.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131745361, null), new sg0(this, 26)), true));
            return;
        }
        int i13 = premiumPreviewFragment.E;
        if (i3 == i13 && premiumPreviewFragment.h0 == 1) {
            y8Var2.setText(org.telegram.messenger.bd.M0(2131747001, null));
            return;
        }
        if (i3 != i13 || (tL_help_premiumPromo = premiumPreviewFragment.getMediaDataController().E) == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(tL_help_premiumPromo.status_text);
        org.telegram.messenger.li.g(tL_help_premiumPromo.status_entities, tL_help_premiumPromo.status_text, spannableString, -1);
        org.telegram.ui.Components.uy0[] uy0VarArr = (org.telegram.ui.Components.uy0[]) spannableString.getSpans(0, spannableString.length(), org.telegram.ui.Components.uy0.class);
        int length = uy0VarArr.length;
        int i14 = 0;
        while (i14 < length) {
            org.telegram.ui.Components.ty0 ty0Var = uy0VarArr[i14].b;
            TLRPC.MessageEntity messageEntity = ty0Var.d;
            if (messageEntity != null) {
                String str3 = tL_help_premiumPromo.status_text;
                int i15 = messageEntity.offset;
                str = TextUtils.substring(str3, i15, messageEntity.length + i15);
            } else {
                str = str2;
            }
            TLRPC.MessageEntity messageEntity2 = ty0Var.d;
            if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                spannableString.setSpan(new org.telegram.ui.Components.s31(str, 0, ty0Var), ty0Var.b, ty0Var.c, 33);
            } else {
                if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                    i10 = i14;
                    spannableString.setSpan(new org.telegram.ui.Components.v31(str, ty0Var), ty0Var.b, ty0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                    spannableString.setSpan(new org.telegram.ui.Components.x31(t4.c.f("mailto:", str), ty0Var), ty0Var.b, ty0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                    if (str.toLowerCase().contains("://")) {
                        spannableString.setSpan(new org.telegram.ui.Components.t31(str, ty0Var), ty0Var.b, ty0Var.c, 33);
                    } else {
                        spannableString.setSpan(new org.telegram.ui.Components.t31("http://".concat(str), ty0Var), ty0Var.b, ty0Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                    spannableString.setSpan(new org.telegram.ui.Components.v31(t4.c.f("card:", str), ty0Var), ty0Var.b, ty0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                    String d = mf.b.d(str, z12);
                    if (str.startsWith("+")) {
                        d = t4.c.f("+", d);
                    }
                    spannableString.setSpan(new org.telegram.ui.Components.t31(t4.c.f("tel:", d), ty0Var), ty0Var.b, ty0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                    org.telegram.ui.Components.x31 x31Var = new org.telegram.ui.Components.x31(ty0Var.d.url, ty0Var);
                    x31Var.b = r6;
                    spannableString.setSpan(x31Var, ty0Var.b, ty0Var.c, 33);
                    if (!z11) {
                        spannableString.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), ty0Var.b, ty0Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                    spannableString.setSpan(new org.telegram.ui.Components.y31("" + ((TLRPC.TL_messageEntityMentionName) ty0Var.d).user_id, 0, ty0Var), ty0Var.b, ty0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                    spannableString.setSpan(new org.telegram.ui.Components.y31("" + ((TLRPC.TL_inputMessageEntityMentionName) ty0Var.d).user_id.user_id, 0, ty0Var), ty0Var.b, ty0Var.c, 33);
                } else if ((ty0Var.a & 4) != 0) {
                    i10 = i14;
                    spannableString.setSpan(new org.telegram.ui.Components.u31(spannableString, ty0Var.b, ty0Var.c, (byte) 0, ty0Var), ty0Var.b, ty0Var.c, 33);
                } else {
                    i10 = i14;
                    spannableString.setSpan(new org.telegram.ui.Components.uy0(ty0Var, 0), ty0Var.b, ty0Var.c, 33);
                    z10 = false;
                    int i16 = i10 + 1;
                    z12 = z10;
                    str2 = null;
                    i14 = i16;
                    r6 = true;
                }
                if ((ty0Var.a & 256) != 0) {
                    z10 = false;
                    spannableString.setSpan(new org.telegram.ui.Components.uy0(ty0Var, 0), ty0Var.b, ty0Var.c, 33);
                    int i162 = i10 + 1;
                    z12 = z10;
                    str2 = null;
                    i14 = i162;
                    r6 = true;
                }
                z10 = false;
                int i1622 = i10 + 1;
                z12 = z10;
                str2 = null;
                i14 = i1622;
                r6 = true;
            }
            i10 = i14;
            if ((ty0Var.a & 256) != 0) {
            }
            z10 = false;
            int i16222 = i10 + 1;
            z12 = z10;
            str2 = null;
            i14 = i16222;
            r6 = true;
        }
        y8Var2.setText(spannableString);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View es0Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = viewGroup.getContext();
        switch (i3) {
            case 1:
                es0Var = new es0(this, context);
                break;
            case 2:
                es0Var = new org.telegram.ui.Cells.x6(context, 0, 0);
                break;
            case 3:
            default:
                es0Var = new org.telegram.ui.Components.voip.r0(8, context, this);
                es0Var.setTag(-33024);
                break;
            case 4:
                es0Var = new ci.q(context);
                break;
            case 5:
                es0Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 6:
                es0Var = new View(context);
                es0Var.setTag(-33024);
                break;
            case 7:
                es0Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.d2) this.c).resourceProvider;
                es0Var = new org.telegram.ui.Cells.l8(23, context, e6Var, false, true);
                break;
        }
        return k2.p1.p(es0Var, es0Var, -1, -2);
    }
}
