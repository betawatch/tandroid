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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ex0 extends org.telegram.ui.Components.ul0 {
    public final /* synthetic */ PremiumPreviewFragment c;

    public ex0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 1 || i10 == 8;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.h;
    }

    @Override // s4.h0
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
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.TL_help_premiumPromo premiumPromo;
        String str;
        String str2;
        int i11;
        View view = c1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z10 = premiumPreviewFragment.h0;
        int i12 = premiumPreviewFragment.n;
        boolean z11 = false;
        if (i10 >= i12 && i10 < premiumPreviewFragment.r) {
            ((ww0) view).a((mx0) premiumPreviewFragment.b.get(i10 - i12), i10 != premiumPreviewFragment.r - 1);
            return;
        }
        int i13 = premiumPreviewFragment.v;
        if (i10 >= i13 && i10 < premiumPreviewFragment.w) {
            ((ww0) view).a((mx0) premiumPreviewFragment.c.get(i10 - i13), i10 != premiumPreviewFragment.w - 1);
            return;
        }
        String str3 = "";
        if (i10 == premiumPreviewFragment.x) {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            f9Var.setText("");
            f9Var.setFixedSize(12);
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
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                String string = LocaleController.getString(R.string.ShowAds);
                if (userFull != null && !userFull.sponsored_enabled) {
                    r6 = false;
                }
                s8Var.j(string, r6, false);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.f9 f9Var2 = (org.telegram.ui.Cells.f9) view;
        if (!z10) {
            f9Var2.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.75f, -1));
            f9Var2.getTextView().setLinkTextColor(-1);
            f9Var2.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.15f, -1)));
        }
        f9Var2.setFixedSize(0);
        if (i10 == premiumPreviewFragment.H) {
            f9Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ShowAdsInfo), new ql0(this, 23)), true));
            return;
        }
        int i14 = premiumPreviewFragment.y;
        if (i10 == i14 && premiumPreviewFragment.g0 == 1) {
            f9Var2.setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeaturesInfo));
            return;
        }
        if (i10 != i14 || (premiumPromo = premiumPreviewFragment.getMediaDataController().getPremiumPromo()) == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(premiumPromo.status_text);
        MediaDataController.addTextStyleRuns(premiumPromo.status_entities, premiumPromo.status_text, spannableString);
        org.telegram.ui.Components.c11[] c11VarArr = (org.telegram.ui.Components.c11[]) spannableString.getSpans(0, spannableString.length(), org.telegram.ui.Components.c11.class);
        int length = c11VarArr.length;
        int i15 = 0;
        while (i15 < length) {
            org.telegram.ui.Components.b11 b11Var = c11VarArr[i15].b;
            TLRPC.MessageEntity messageEntity = b11Var.d;
            if (messageEntity != null) {
                String str4 = premiumPromo.status_text;
                int i16 = messageEntity.offset;
                str = TextUtils.substring(str4, i16, messageEntity.length + i16);
            } else {
                str = null;
            }
            TLRPC.MessageEntity messageEntity2 = b11Var.d;
            if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                spannableString.setSpan(new org.telegram.ui.Components.w51(str, 0, b11Var), b11Var.b, b11Var.c, 33);
            } else {
                if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                    str2 = str3;
                    i11 = 33;
                    spannableString.setSpan(new org.telegram.ui.Components.z51(str, b11Var), b11Var.b, b11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                    spannableString.setSpan(new org.telegram.ui.Components.b61(org.telegram.ui.Cells.r6.i("mailto:", str), b11Var), b11Var.b, b11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                    if (str.toLowerCase().contains("://")) {
                        spannableString.setSpan(new org.telegram.ui.Components.x51(str, b11Var), b11Var.b, b11Var.c, 33);
                    } else {
                        spannableString.setSpan(new org.telegram.ui.Components.x51("http://".concat(str), b11Var), b11Var.b, b11Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                    spannableString.setSpan(new org.telegram.ui.Components.z51(org.telegram.ui.Cells.r6.i("card:", str), b11Var), b11Var.b, b11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                    String d = gf.b.d(str, z11);
                    if (str.startsWith("+")) {
                        d = org.telegram.ui.Cells.r6.i("+", d);
                    }
                    spannableString.setSpan(new org.telegram.ui.Components.x51(org.telegram.ui.Cells.r6.i("tel:", d), b11Var), b11Var.b, b11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                    org.telegram.ui.Components.b61 b61Var = new org.telegram.ui.Components.b61(b11Var.d.url, b11Var);
                    b61Var.b = true;
                    spannableString.setSpan(b61Var, b11Var.b, b11Var.c, 33);
                    if (!z10) {
                        spannableString.setSpan(new org.telegram.ui.Components.s51(AndroidUtilities.bold()), b11Var.b, b11Var.c, 33);
                    }
                } else {
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                        StringBuilder sb2 = new StringBuilder(str3);
                        str2 = str3;
                        sb2.append(((TLRPC.TL_messageEntityMentionName) b11Var.d).user_id);
                        spannableString.setSpan(new org.telegram.ui.Components.c61(sb2.toString(), 0, b11Var), b11Var.b, b11Var.c, 33);
                    } else {
                        str2 = str3;
                        if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            spannableString.setSpan(new org.telegram.ui.Components.c61(str2 + ((TLRPC.TL_inputMessageEntityMentionName) b11Var.d).user_id.user_id, 0, b11Var), b11Var.b, b11Var.c, 33);
                        } else if ((b11Var.a & 4) != 0) {
                            str2 = str2;
                            i11 = 33;
                            spannableString.setSpan(new org.telegram.ui.Components.y51(spannableString, b11Var.b, b11Var.c, (byte) 0, b11Var), b11Var.b, b11Var.c, 33);
                        } else {
                            str2 = str2;
                            spannableString.setSpan(new org.telegram.ui.Components.c11(b11Var, 0), b11Var.b, b11Var.c, 33);
                            i15++;
                            str3 = str2;
                            z11 = false;
                        }
                    }
                    i11 = 33;
                }
                if ((b11Var.a & 256) != 0) {
                    spannableString.setSpan(new org.telegram.ui.Components.c11(b11Var, 0), b11Var.b, b11Var.c, i11);
                    i15++;
                    str3 = str2;
                    z11 = false;
                }
                i15++;
                str3 = str2;
                z11 = false;
            }
            str2 = str3;
            i11 = 33;
            if ((b11Var.a & 256) != 0) {
            }
            i15++;
            str3 = str2;
            z11 = false;
        }
        f9Var2.setText(spannableString);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View dx0Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                dx0Var = new dx0(this, context);
                break;
            case 2:
                dx0Var = new org.telegram.ui.Cells.c7(context, 0, 0);
                break;
            case 3:
            default:
                dx0Var = new t50(this, context, 5);
                dx0Var.setTag(-33024);
                break;
            case 4:
                dx0Var = new qg.a(context);
                break;
            case 5:
                dx0Var = new org.telegram.ui.Cells.f9(context);
                break;
            case 6:
                dx0Var = new View(context);
                dx0Var.setTag(-33024);
                break;
            case 7:
                dx0Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.p2) this.c).resourceProvider;
                dx0Var = new org.telegram.ui.Cells.s8(23, context, f6Var, false, true);
                break;
        }
        return com.google.android.gms.internal.vision.e2.j(dx0Var, dx0Var, -1, -2);
    }
}
