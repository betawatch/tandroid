package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ps0 extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ PremiumPreviewFragment c;

    public ps0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 1 || i7 == 8;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.h;
    }

    @Override // v4.g0
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
        if (i7 == premiumPreviewFragment.y || i7 == premiumPreviewFragment.D || i7 == premiumPreviewFragment.E || i7 == premiumPreviewFragment.H) {
            return 5;
        }
        if (i7 == premiumPreviewFragment.F) {
            return 6;
        }
        if (i7 == premiumPreviewFragment.s || i7 == premiumPreviewFragment.G) {
            return 7;
        }
        return i7 == premiumPreviewFragment.showAdsRow ? 8 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x02ac  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        String str;
        int i10;
        boolean z9;
        View view = d1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z10 = premiumPreviewFragment.h0;
        int i11 = premiumPreviewFragment.n;
        boolean z11 = false;
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
        if (i7 != premiumPreviewFragment.D && i7 != premiumPreviewFragment.E && i7 != premiumPreviewFragment.H) {
            if (i7 == premiumPreviewFragment.s) {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.hd.M0(2131746993, null));
                return;
            }
            if (i7 == premiumPreviewFragment.G) {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.hd.M0(2131745351, null));
                return;
            }
            if (i7 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull b22 = premiumPreviewFragment.getMessagesController().b2(premiumPreviewFragment.getUserConfig().e());
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                String M0 = org.telegram.messenger.hd.M0(2131745353, null);
                if (b22 != null && !b22.sponsored_enabled) {
                    r6 = false;
                }
                m8Var.l(M0, r6, false);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.z8 z8Var2 = (org.telegram.ui.Cells.z8) view;
        if (!z10) {
            z8Var2.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
            z8Var2.getTextView().setLinkTextColor(-1);
            z8Var2.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.15f, -1)));
        }
        z8Var2.setFixedSize(0);
        if (i7 == premiumPreviewFragment.H) {
            z8Var2.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131745352, null), new ef0(this, 27)), true));
            return;
        }
        int i13 = premiumPreviewFragment.D;
        if (i7 == i13 && premiumPreviewFragment.g0 == 1) {
            z8Var2.setText(org.telegram.messenger.hd.M0(2131746992, null));
            return;
        }
        if (i7 != i13 || (tL_help_premiumPromo = premiumPreviewFragment.getMediaDataController().D) == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(tL_help_premiumPromo.status_text);
        org.telegram.messenger.ui.g(tL_help_premiumPromo.status_entities, tL_help_premiumPromo.status_text, spannableString, -1);
        org.telegram.ui.Components.vy0[] vy0VarArr = (org.telegram.ui.Components.vy0[]) spannableString.getSpans(0, spannableString.length(), org.telegram.ui.Components.vy0.class);
        int length = vy0VarArr.length;
        int i14 = 0;
        while (i14 < length) {
            org.telegram.ui.Components.uy0 uy0Var = vy0VarArr[i14].b;
            TLRPC.MessageEntity messageEntity = uy0Var.d;
            if (messageEntity != null) {
                String str3 = tL_help_premiumPromo.status_text;
                int i15 = messageEntity.offset;
                str = TextUtils.substring(str3, i15, messageEntity.length + i15);
            } else {
                str = str2;
            }
            TLRPC.MessageEntity messageEntity2 = uy0Var.d;
            if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                spannableString.setSpan(new org.telegram.ui.Components.y31(str, 0, uy0Var), uy0Var.b, uy0Var.c, 33);
            } else {
                if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                    i10 = i14;
                    spannableString.setSpan(new org.telegram.ui.Components.b41(str, uy0Var), uy0Var.b, uy0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                    spannableString.setSpan(new org.telegram.ui.Components.d41(rf.b.i("mailto:", str), uy0Var), uy0Var.b, uy0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                    if (str.toLowerCase().contains("://")) {
                        spannableString.setSpan(new org.telegram.ui.Components.z31(str, uy0Var), uy0Var.b, uy0Var.c, 33);
                    } else {
                        spannableString.setSpan(new org.telegram.ui.Components.z31("http://".concat(str), uy0Var), uy0Var.b, uy0Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                    spannableString.setSpan(new org.telegram.ui.Components.b41(rf.b.i("card:", str), uy0Var), uy0Var.b, uy0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                    String d = pf.b.d(str, z11);
                    if (str.startsWith("+")) {
                        d = rf.b.i("+", d);
                    }
                    spannableString.setSpan(new org.telegram.ui.Components.z31(rf.b.i("tel:", d), uy0Var), uy0Var.b, uy0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                    org.telegram.ui.Components.d41 d41Var = new org.telegram.ui.Components.d41(uy0Var.d.url, uy0Var);
                    d41Var.b = r6;
                    spannableString.setSpan(d41Var, uy0Var.b, uy0Var.c, 33);
                    if (!z10) {
                        spannableString.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), uy0Var.b, uy0Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                    spannableString.setSpan(new org.telegram.ui.Components.e41("" + ((TLRPC.TL_messageEntityMentionName) uy0Var.d).user_id, 0, uy0Var), uy0Var.b, uy0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                    spannableString.setSpan(new org.telegram.ui.Components.e41("" + ((TLRPC.TL_inputMessageEntityMentionName) uy0Var.d).user_id.user_id, 0, uy0Var), uy0Var.b, uy0Var.c, 33);
                } else if ((uy0Var.a & 4) != 0) {
                    i10 = i14;
                    spannableString.setSpan(new org.telegram.ui.Components.a41(spannableString, uy0Var.b, uy0Var.c, (byte) 0, uy0Var), uy0Var.b, uy0Var.c, 33);
                } else {
                    i10 = i14;
                    spannableString.setSpan(new org.telegram.ui.Components.vy0(uy0Var, 0), uy0Var.b, uy0Var.c, 33);
                    z9 = false;
                    int i16 = i10 + 1;
                    z11 = z9;
                    str2 = null;
                    i14 = i16;
                    r6 = true;
                }
                if ((uy0Var.a & 256) != 0) {
                    z9 = false;
                    spannableString.setSpan(new org.telegram.ui.Components.vy0(uy0Var, 0), uy0Var.b, uy0Var.c, 33);
                    int i162 = i10 + 1;
                    z11 = z9;
                    str2 = null;
                    i14 = i162;
                    r6 = true;
                }
                z9 = false;
                int i1622 = i10 + 1;
                z11 = z9;
                str2 = null;
                i14 = i1622;
                r6 = true;
            }
            i10 = i14;
            if ((uy0Var.a & 256) != 0) {
            }
            z9 = false;
            int i16222 = i10 + 1;
            z11 = z9;
            str2 = null;
            i14 = i16222;
            r6 = true;
        }
        z8Var2.setText(spannableString);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View os0Var;
        org.telegram.ui.ActionBar.f6 f6Var;
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
                os0Var = new l00(6, context, this);
                os0Var.setTag(-33024);
                break;
            case 4:
                os0Var = new bi.t(context);
                break;
            case 5:
                os0Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 6:
                os0Var = new View(context);
                os0Var.setTag(-33024);
                break;
            case 7:
                os0Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.f2) this.c).resourceProvider;
                os0Var = new org.telegram.ui.Cells.m8(23, context, f6Var, false, true);
                break;
        }
        return jg.g.r(os0Var, os0Var, -1, -2);
    }
}
