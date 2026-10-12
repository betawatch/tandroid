package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ix0 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ PremiumPreviewFragment c;

    public ix0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 1 || i10 == 8;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.h;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        if (i10 >= premiumPreviewFragment.n && i10 < premiumPreviewFragment.r) {
            return 1;
        }
        if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.w) {
            return 1;
        }
        if (i10 == 0) {
            return 4;
        }
        if (i10 == premiumPreviewFragment.x || i10 == premiumPreviewFragment.y || i10 == premiumPreviewFragment.E || i10 == premiumPreviewFragment.H) {
            return 5;
        }
        if (i10 == premiumPreviewFragment.F) {
            return 6;
        }
        if (i10 == premiumPreviewFragment.s || i10 == premiumPreviewFragment.G) {
            return 7;
        }
        return i10 == premiumPreviewFragment.showAdsRow ? 8 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x02be  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.TL_help_premiumPromo premiumPromo;
        String str;
        String str2;
        int i11;
        boolean z10;
        View view = b1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z11 = premiumPreviewFragment.h0;
        int i12 = premiumPreviewFragment.n;
        boolean z12 = false;
        if (i10 >= i12 && i10 < premiumPreviewFragment.r) {
            ((ax0) view).a((qx0) premiumPreviewFragment.b.get(i10 - i12), i10 != premiumPreviewFragment.r - 1);
            return;
        }
        int i13 = premiumPreviewFragment.v;
        if (i10 >= i13 && i10 < premiumPreviewFragment.w) {
            ((ax0) view).a((qx0) premiumPreviewFragment.c.get(i10 - i13), i10 != premiumPreviewFragment.w - 1);
            return;
        }
        String str3 = "";
        if (i10 == premiumPreviewFragment.x) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setText("");
            e9Var.setFixedSize(12);
            return;
        }
        if (i10 != premiumPreviewFragment.y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
            if (i10 == premiumPreviewFragment.s) {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeatures));
                return;
            }
            if (i10 == premiumPreviewFragment.G) {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.ShowAdsTitle));
                return;
            }
            if (i10 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull userFull = premiumPreviewFragment.getMessagesController().getUserFull(premiumPreviewFragment.getUserConfig().getClientUserId());
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                String string = LocaleController.getString(R.string.ShowAds);
                if (userFull != null && !userFull.sponsored_enabled) {
                    r6 = false;
                }
                r8Var.j(string, r6, false);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.e9 e9Var2 = (org.telegram.ui.Cells.e9) view;
        if (!z11) {
            e9Var2.setTextColor(org.telegram.ui.ActionBar.g6.m1(0.75f, -1));
            e9Var2.getTextView().setLinkTextColor(-1);
            e9Var2.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.g6.m1(0.15f, -1)));
        }
        e9Var2.setFixedSize(0);
        if (i10 == premiumPreviewFragment.H) {
            e9Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ShowAdsInfo), new yk0(this, 24)), true));
            return;
        }
        int i14 = premiumPreviewFragment.y;
        if (i10 == i14 && premiumPreviewFragment.g0 == 1) {
            e9Var2.setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeaturesInfo));
            return;
        }
        if (i10 != i14 || (premiumPromo = premiumPreviewFragment.getMediaDataController().getPremiumPromo()) == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(premiumPromo.status_text);
        MediaDataController.addTextStyleRuns(premiumPromo.status_entities, premiumPromo.status_text, spannableString);
        org.telegram.ui.Components.q11[] q11VarArr = (org.telegram.ui.Components.q11[]) spannableString.getSpans(0, spannableString.length(), org.telegram.ui.Components.q11.class);
        int length = q11VarArr.length;
        int i15 = 0;
        while (i15 < length) {
            org.telegram.ui.Components.p11 p11Var = q11VarArr[i15].b;
            TLRPC.MessageEntity messageEntity = p11Var.d;
            if (messageEntity != null) {
                String str4 = premiumPromo.status_text;
                int i16 = messageEntity.offset;
                str = TextUtils.substring(str4, i16, messageEntity.length + i16);
            } else {
                str = null;
            }
            TLRPC.MessageEntity messageEntity2 = p11Var.d;
            if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                spannableString.setSpan(new org.telegram.ui.Components.m61(str, 0, p11Var), p11Var.b, p11Var.c, 33);
            } else {
                if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                    str2 = str3;
                    i11 = 33;
                    spannableString.setSpan(new org.telegram.ui.Components.p61(str, p11Var), p11Var.b, p11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                    spannableString.setSpan(new org.telegram.ui.Components.r61(t8.b.h("mailto:", str), p11Var), p11Var.b, p11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                    if (str.toLowerCase().contains("://")) {
                        spannableString.setSpan(new org.telegram.ui.Components.n61(str, p11Var), p11Var.b, p11Var.c, 33);
                    } else {
                        spannableString.setSpan(new org.telegram.ui.Components.n61("http://".concat(str), p11Var), p11Var.b, p11Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                    spannableString.setSpan(new org.telegram.ui.Components.p61(t8.b.h("card:", str), p11Var), p11Var.b, p11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                    String d = jf.b.d(str, z12);
                    if (str.startsWith("+")) {
                        d = t8.b.h("+", d);
                    }
                    spannableString.setSpan(new org.telegram.ui.Components.n61(t8.b.h("tel:", d), p11Var), p11Var.b, p11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                    org.telegram.ui.Components.r61 r61Var = new org.telegram.ui.Components.r61(p11Var.d.url, p11Var);
                    r61Var.b = true;
                    spannableString.setSpan(r61Var, p11Var.b, p11Var.c, 33);
                    if (!z11) {
                        spannableString.setSpan(new org.telegram.ui.Components.i61(AndroidUtilities.bold()), p11Var.b, p11Var.c, 33);
                    }
                    str2 = str3;
                    i11 = 33;
                } else {
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                        StringBuilder sb2 = new StringBuilder(str3);
                        str2 = str3;
                        sb2.append(((TLRPC.TL_messageEntityMentionName) p11Var.d).user_id);
                        spannableString.setSpan(new org.telegram.ui.Components.s61(sb2.toString(), 0, p11Var), p11Var.b, p11Var.c, 33);
                    } else {
                        str2 = str3;
                        if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            spannableString.setSpan(new org.telegram.ui.Components.s61(str2 + ((TLRPC.TL_inputMessageEntityMentionName) p11Var.d).user_id.user_id, 0, p11Var), p11Var.b, p11Var.c, 33);
                        } else if ((p11Var.a & 4) != 0) {
                            str2 = str2;
                            i11 = 33;
                            spannableString.setSpan(new org.telegram.ui.Components.o61(spannableString, p11Var.b, p11Var.c, (byte) 0, p11Var), p11Var.b, p11Var.c, 33);
                        } else {
                            str2 = str2;
                            spannableString.setSpan(new org.telegram.ui.Components.q11(p11Var, 0), p11Var.b, p11Var.c, 33);
                            z10 = false;
                            i15++;
                            z12 = z10;
                            str3 = str2;
                        }
                    }
                    i11 = 33;
                }
                if ((p11Var.a & 256) != 0) {
                    z10 = false;
                    spannableString.setSpan(new org.telegram.ui.Components.q11(p11Var, 0), p11Var.b, p11Var.c, i11);
                    i15++;
                    z12 = z10;
                    str3 = str2;
                }
                z10 = false;
                i15++;
                z12 = z10;
                str3 = str2;
            }
            str2 = str3;
            i11 = 33;
            if ((p11Var.a & 256) != 0) {
            }
            z10 = false;
            i15++;
            z12 = z10;
            str3 = str2;
        }
        e9Var2.setText(spannableString);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View hx0Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                hx0Var = new hx0(this, context);
                break;
            case 2:
                hx0Var = new org.telegram.ui.Cells.b7(context, 0, 0);
                break;
            case 3:
            default:
                hx0Var = new x50(this, context, 5);
                hx0Var.setTag(-33024);
                break;
            case 4:
                hx0Var = new sg.a(context);
                break;
            case 5:
                hx0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 6:
                hx0Var = new View(context);
                hx0Var.setTag(-33024);
                break;
            case 7:
                hx0Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 8:
                c6Var = ((org.telegram.ui.ActionBar.m2) this.c).resourceProvider;
                hx0Var = new org.telegram.ui.Cells.r8(23, context, c6Var, false, true);
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(hx0Var, hx0Var, -1, -2);
    }
}
