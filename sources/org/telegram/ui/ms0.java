package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ms0 extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ PremiumPreviewFragment c;

    public ms0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 1 || i7 == 8;
    }

    @Override // v4.h0
    public final int b() {
        return this.c.h;
    }

    @Override // v4.h0
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
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        String str;
        int i10;
        boolean z10;
        View view = e1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z11 = premiumPreviewFragment.i0;
        int i11 = premiumPreviewFragment.n;
        boolean z12 = false;
        if (i7 >= i11 && i7 < premiumPreviewFragment.r) {
            ((fs0) view).a((ss0) premiumPreviewFragment.b.get(i7 - i11), i7 != premiumPreviewFragment.r - 1);
            return;
        }
        int i12 = premiumPreviewFragment.w;
        if (i7 >= i12 && i7 < premiumPreviewFragment.x) {
            ((fs0) view).a((ss0) premiumPreviewFragment.c.get(i7 - i12), i7 != premiumPreviewFragment.x - 1);
            return;
        }
        if (i7 == premiumPreviewFragment.y) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setText("");
            y8Var.setFixedSize(12);
            return;
        }
        String str2 = null;
        if (i7 != premiumPreviewFragment.E && i7 != premiumPreviewFragment.F && i7 != premiumPreviewFragment.I) {
            if (i7 == premiumPreviewFragment.s) {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.hd.M0(2131746994, null));
                return;
            }
            if (i7 == premiumPreviewFragment.H) {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.hd.M0(2131745350, null));
                return;
            }
            if (i7 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull b22 = premiumPreviewFragment.getMessagesController().b2(premiumPreviewFragment.getUserConfig().e());
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                String M0 = org.telegram.messenger.hd.M0(2131745352, null);
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
            y8Var2.setTextColor(org.telegram.ui.ActionBar.j6.r1(0.75f, -1));
            y8Var2.getTextView().setLinkTextColor(-1);
            y8Var2.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.15f, -1)));
        }
        y8Var2.setFixedSize(0);
        if (i7 == premiumPreviewFragment.I) {
            y8Var2.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131745351, null), new ef0(this, 27)), true));
            return;
        }
        int i13 = premiumPreviewFragment.E;
        if (i7 == i13 && premiumPreviewFragment.h0 == 1) {
            y8Var2.setText(org.telegram.messenger.hd.M0(2131746993, null));
            return;
        }
        if (i7 != i13 || (tL_help_premiumPromo = premiumPreviewFragment.getMediaDataController().E) == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(tL_help_premiumPromo.status_text);
        org.telegram.messenger.si.g(tL_help_premiumPromo.status_entities, tL_help_premiumPromo.status_text, spannableString, -1);
        org.telegram.ui.Components.xy0[] xy0VarArr = (org.telegram.ui.Components.xy0[]) spannableString.getSpans(0, spannableString.length(), org.telegram.ui.Components.xy0.class);
        int length = xy0VarArr.length;
        int i14 = 0;
        while (i14 < length) {
            org.telegram.ui.Components.wy0 wy0Var = xy0VarArr[i14].b;
            TLRPC.MessageEntity messageEntity = wy0Var.d;
            if (messageEntity != null) {
                String str3 = tL_help_premiumPromo.status_text;
                int i15 = messageEntity.offset;
                str = TextUtils.substring(str3, i15, messageEntity.length + i15);
            } else {
                str = str2;
            }
            TLRPC.MessageEntity messageEntity2 = wy0Var.d;
            if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                spannableString.setSpan(new org.telegram.ui.Components.c41(str, 0, wy0Var), wy0Var.b, wy0Var.c, 33);
            } else {
                if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                    i10 = i14;
                    spannableString.setSpan(new org.telegram.ui.Components.f41(str, wy0Var), wy0Var.b, wy0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                    spannableString.setSpan(new org.telegram.ui.Components.h41(r.b.k("mailto:", str), wy0Var), wy0Var.b, wy0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                    if (str.toLowerCase().contains("://")) {
                        spannableString.setSpan(new org.telegram.ui.Components.d41(str, wy0Var), wy0Var.b, wy0Var.c, 33);
                    } else {
                        spannableString.setSpan(new org.telegram.ui.Components.d41("http://".concat(str), wy0Var), wy0Var.b, wy0Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                    spannableString.setSpan(new org.telegram.ui.Components.f41(r.b.k("card:", str), wy0Var), wy0Var.b, wy0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                    String d = pf.b.d(str, z12);
                    if (str.startsWith("+")) {
                        d = r.b.k("+", d);
                    }
                    spannableString.setSpan(new org.telegram.ui.Components.d41(r.b.k("tel:", d), wy0Var), wy0Var.b, wy0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                    org.telegram.ui.Components.h41 h41Var = new org.telegram.ui.Components.h41(wy0Var.d.url, wy0Var);
                    h41Var.b = r6;
                    spannableString.setSpan(h41Var, wy0Var.b, wy0Var.c, 33);
                    if (!z11) {
                        spannableString.setSpan(new org.telegram.ui.Components.y31(org.telegram.messenger.g0.o()), wy0Var.b, wy0Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                    spannableString.setSpan(new org.telegram.ui.Components.i41("" + ((TLRPC.TL_messageEntityMentionName) wy0Var.d).user_id, 0, wy0Var), wy0Var.b, wy0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                    spannableString.setSpan(new org.telegram.ui.Components.i41("" + ((TLRPC.TL_inputMessageEntityMentionName) wy0Var.d).user_id.user_id, 0, wy0Var), wy0Var.b, wy0Var.c, 33);
                } else if ((wy0Var.a & 4) != 0) {
                    i10 = i14;
                    spannableString.setSpan(new org.telegram.ui.Components.e41(spannableString, wy0Var.b, wy0Var.c, (byte) 0, wy0Var), wy0Var.b, wy0Var.c, 33);
                } else {
                    i10 = i14;
                    spannableString.setSpan(new org.telegram.ui.Components.xy0(wy0Var, 0), wy0Var.b, wy0Var.c, 33);
                    z10 = false;
                    int i16 = i10 + 1;
                    z12 = z10;
                    str2 = null;
                    i14 = i16;
                    r6 = true;
                }
                if ((wy0Var.a & 256) != 0) {
                    z10 = false;
                    spannableString.setSpan(new org.telegram.ui.Components.xy0(wy0Var, 0), wy0Var.b, wy0Var.c, 33);
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
            if ((wy0Var.a & 256) != 0) {
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

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View ls0Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = viewGroup.getContext();
        switch (i7) {
            case 1:
                ls0Var = new ls0(this, context);
                break;
            case 2:
                ls0Var = new org.telegram.ui.Cells.x6(context, 0, 0);
                break;
            case 3:
            default:
                ls0Var = new rv(7, context, this);
                ls0Var.setTag(-33024);
                break;
            case 4:
                ls0Var = new ai.q2(context);
                break;
            case 5:
                ls0Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 6:
                ls0Var = new View(context);
                ls0Var.setTag(-33024);
                break;
            case 7:
                ls0Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.e2) this.c).resourceProvider;
                ls0Var = new org.telegram.ui.Cells.l8(23, context, e6Var, false, true);
                break;
        }
        return i5.c.q(ls0Var, ls0Var, -1, -2);
    }
}
