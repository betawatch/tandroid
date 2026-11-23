package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ps0 extends org.telegram.ui.Components.dk0 {
    public final /* synthetic */ PremiumPreviewFragment c;

    public ps0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 1 || i7 == 8;
    }

    @Override // v4.i0
    public final int b() {
        return this.c.h;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        if (i7 >= premiumPreviewFragment.n && i7 < premiumPreviewFragment.r) {
            return 1;
        }
        if (i7 >= premiumPreviewFragment.w && i7 < premiumPreviewFragment.x) {
            return 1;
        }
        if (i7 == 0) {
            return 4;
        }
        if (i7 == premiumPreviewFragment.y || i7 == premiumPreviewFragment.E || i7 == premiumPreviewFragment.F || i7 == premiumPreviewFragment.I) {
            return 5;
        }
        if (i7 == premiumPreviewFragment.G) {
            return 6;
        }
        if (i7 == premiumPreviewFragment.s || i7 == premiumPreviewFragment.H) {
            return 7;
        }
        return i7 == premiumPreviewFragment.showAdsRow ? 8 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x02ac  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        String str;
        int i10;
        boolean z10;
        View view = f1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z11 = premiumPreviewFragment.i0;
        int i11 = premiumPreviewFragment.n;
        boolean z12 = false;
        if (i7 >= i11 && i7 < premiumPreviewFragment.r) {
            ((is0) view).a((vs0) premiumPreviewFragment.b.get(i7 - i11), i7 != premiumPreviewFragment.r - 1);
            return;
        }
        int i12 = premiumPreviewFragment.w;
        if (i7 >= i12 && i7 < premiumPreviewFragment.x) {
            ((is0) view).a((vs0) premiumPreviewFragment.c.get(i7 - i12), i7 != premiumPreviewFragment.x - 1);
            return;
        }
        if (i7 == premiumPreviewFragment.y) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setText("");
            z8Var.setFixedSize(12);
            return;
        }
        String str2 = null;
        if (i7 != premiumPreviewFragment.E && i7 != premiumPreviewFragment.F && i7 != premiumPreviewFragment.I) {
            if (i7 == premiumPreviewFragment.s) {
                ((org.telegram.ui.Cells.o4) view).setText(org.telegram.messenger.gd.N0(2131746800, null));
                return;
            }
            if (i7 == premiumPreviewFragment.H) {
                ((org.telegram.ui.Cells.o4) view).setText(org.telegram.messenger.gd.N0(2131745154, null));
                return;
            }
            if (i7 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull d2 = premiumPreviewFragment.getMessagesController().d2(premiumPreviewFragment.getUserConfig().e());
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                String N0 = org.telegram.messenger.gd.N0(2131745156, null);
                if (d2 != null && !d2.sponsored_enabled) {
                    r6 = false;
                }
                m8Var.l(N0, r6, false);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.z8 z8Var2 = (org.telegram.ui.Cells.z8) view;
        if (!z11) {
            z8Var2.setTextColor(org.telegram.ui.ActionBar.n6.r1(0.75f, -1));
            z8Var2.getTextView().setLinkTextColor(-1);
            z8Var2.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.15f, -1)));
        }
        z8Var2.setFixedSize(0);
        if (i7 == premiumPreviewFragment.I) {
            z8Var2.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131745155, null), new gf0(this, 27)), true));
            return;
        }
        int i13 = premiumPreviewFragment.E;
        if (i7 == i13 && premiumPreviewFragment.h0 == 1) {
            z8Var2.setText(org.telegram.messenger.gd.N0(2131746799, null));
            return;
        }
        if (i7 != i13 || (tL_help_premiumPromo = premiumPreviewFragment.getMediaDataController().E) == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(tL_help_premiumPromo.status_text);
        org.telegram.messenger.ri.g(tL_help_premiumPromo.status_entities, tL_help_premiumPromo.status_text, spannableString, -1);
        org.telegram.ui.Components.fz0[] fz0VarArr = (org.telegram.ui.Components.fz0[]) spannableString.getSpans(0, spannableString.length(), org.telegram.ui.Components.fz0.class);
        int length = fz0VarArr.length;
        int i14 = 0;
        while (i14 < length) {
            org.telegram.ui.Components.ez0 ez0Var = fz0VarArr[i14].b;
            TLRPC.MessageEntity messageEntity = ez0Var.d;
            if (messageEntity != null) {
                String str3 = tL_help_premiumPromo.status_text;
                int i15 = messageEntity.offset;
                str = TextUtils.substring(str3, i15, messageEntity.length + i15);
            } else {
                str = str2;
            }
            TLRPC.MessageEntity messageEntity2 = ez0Var.d;
            if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                spannableString.setSpan(new org.telegram.ui.Components.o41(str, 0, ez0Var), ez0Var.b, ez0Var.c, 33);
            } else {
                if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                    i10 = i14;
                    spannableString.setSpan(new org.telegram.ui.Components.r41(str, ez0Var), ez0Var.b, ez0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                    spannableString.setSpan(new org.telegram.ui.Components.t41(p5.c.k("mailto:", str), ez0Var), ez0Var.b, ez0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                    if (str.toLowerCase().contains("://")) {
                        spannableString.setSpan(new org.telegram.ui.Components.p41(str, ez0Var), ez0Var.b, ez0Var.c, 33);
                    } else {
                        spannableString.setSpan(new org.telegram.ui.Components.p41("http://".concat(str), ez0Var), ez0Var.b, ez0Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                    spannableString.setSpan(new org.telegram.ui.Components.r41(p5.c.k("card:", str), ez0Var), ez0Var.b, ez0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                    String d = pf.b.d(str, z12);
                    if (str.startsWith("+")) {
                        d = p5.c.k("+", d);
                    }
                    spannableString.setSpan(new org.telegram.ui.Components.p41(p5.c.k("tel:", d), ez0Var), ez0Var.b, ez0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                    org.telegram.ui.Components.t41 t41Var = new org.telegram.ui.Components.t41(ez0Var.d.url, ez0Var);
                    t41Var.b = r6;
                    spannableString.setSpan(t41Var, ez0Var.b, ez0Var.c, 33);
                    if (!z11) {
                        spannableString.setSpan(new org.telegram.ui.Components.k41(org.telegram.messenger.g0.o()), ez0Var.b, ez0Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                    spannableString.setSpan(new org.telegram.ui.Components.u41("" + ((TLRPC.TL_messageEntityMentionName) ez0Var.d).user_id, 0, ez0Var), ez0Var.b, ez0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                    spannableString.setSpan(new org.telegram.ui.Components.u41("" + ((TLRPC.TL_inputMessageEntityMentionName) ez0Var.d).user_id.user_id, 0, ez0Var), ez0Var.b, ez0Var.c, 33);
                } else if ((ez0Var.a & 4) != 0) {
                    i10 = i14;
                    spannableString.setSpan(new org.telegram.ui.Components.q41(spannableString, ez0Var.b, ez0Var.c, (byte) 0, ez0Var), ez0Var.b, ez0Var.c, 33);
                } else {
                    i10 = i14;
                    spannableString.setSpan(new org.telegram.ui.Components.fz0(ez0Var, 0), ez0Var.b, ez0Var.c, 33);
                    z10 = false;
                    int i16 = i10 + 1;
                    z12 = z10;
                    str2 = null;
                    i14 = i16;
                    r6 = true;
                }
                if ((ez0Var.a & 256) != 0) {
                    z10 = false;
                    spannableString.setSpan(new org.telegram.ui.Components.fz0(ez0Var, 0), ez0Var.b, ez0Var.c, 33);
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
            if ((ez0Var.a & 256) != 0) {
            }
            z10 = false;
            int i16222 = i10 + 1;
            z12 = z10;
            str2 = null;
            i14 = i16222;
            r6 = true;
        }
        z8Var2.setText(spannableString);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View os0Var;
        org.telegram.ui.ActionBar.i6 i6Var;
        Context context = viewGroup.getContext();
        switch (i7) {
            case 1:
                os0Var = new os0(this, context);
                break;
            case 2:
                os0Var = new org.telegram.ui.Cells.y6(context, 0, 0);
                break;
            case 3:
            default:
                os0Var = new tv(7, context, this);
                os0Var.setTag(-33024);
                break;
            case 4:
                os0Var = new ai.l2(context);
                break;
            case 5:
                os0Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 6:
                os0Var = new View(context);
                os0Var.setTag(-33024);
                break;
            case 7:
                os0Var = new org.telegram.ui.Cells.o4(context);
                break;
            case 8:
                i6Var = ((org.telegram.ui.ActionBar.g2) this.c).resourceProvider;
                os0Var = new org.telegram.ui.Cells.m8(23, context, i6Var, false, true);
                break;
        }
        return i5.c.q(os0Var, os0Var, -1, -2);
    }
}
