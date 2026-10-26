package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class p10 extends qg.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public p10(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return (i10 == 3 || i10 == 0 || i10 == 5 || i10 == 1) ? false : true;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.n.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        n10 n10Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 < filtersSetupActivity.n.size() && (n10Var = (n10) filtersSetupActivity.n.get(i10)) != null) {
                return n10Var.a;
            }
            return 3;
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c7  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        long j10;
        int max;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        n10 n10Var = (n10) arrayList.get(i10);
        if (n10Var == null) {
            return;
        }
        int i11 = i10 + 1;
        boolean z10 = i11 < arrayList.size() && ((n10) arrayList.get(i11)).a != 3;
        boolean z11 = i11 >= arrayList.size();
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.q4) view).setText(n10Var.c);
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                if (TextUtils.isEmpty(n10Var.c)) {
                    i9Var.setText(null);
                    i9Var.setFixedSize(12);
                } else {
                    i9Var.setFixedSize(0);
                    i9Var.setText(n10Var.c);
                }
                i9Var.setBottomPadding(z11 ? 32 : 17);
                return;
            }
            if (i12 != 4) {
                if (i12 != 5) {
                    if (i12 != 6) {
                        return;
                    }
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    a9Var.f(n10Var.c, filtersSetupActivity.getMessagesController().folderTags, z10);
                    a9Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                    return;
                }
                q10 q10Var = (q10) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = n10Var.e;
                q10Var.d = z10;
                q10Var.e = tL_dialogFilterSuggested;
                q10Var.setWillNotDraw(!z10);
                q10Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                q10Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            r10 r10Var = (r10) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.k7, false), mode));
            org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(drawable, drawable2);
            r10Var.a.l(((Object) n10Var.c) + "", false);
            r10Var.b.setImageDrawable(arVar);
            return;
        }
        l10 l10Var = (l10) view;
        MessagesController.DialogFilter dialogFilter = n10Var.d;
        ImageView imageView = l10Var.h;
        org.telegram.ui.ActionBar.b6 b6Var = l10Var.a;
        ImageView imageView2 = l10Var.c;
        View view2 = l10Var.f;
        FiltersSetupActivity filtersSetupActivity2 = l10Var.H;
        MessagesController.DialogFilter dialogFilter2 = l10Var.x;
        int i13 = dialogFilter2 == null ? -1 : dialogFilter2.id;
        l10Var.x = dialogFilter;
        int i14 = dialogFilter == null ? -1 : dialogFilter.id;
        boolean z12 = i13 != i14;
        int i15 = filtersSetupActivity2.getMessagesController().folderTags ? dialogFilter.color : -1;
        if (i15 >= 0 && dialogFilter.color != l10Var.e) {
            int dp = AndroidUtilities.dp(22.0f);
            int[] iArr = org.telegram.ui.ActionBar.y6.r8;
            l10Var.e = i15;
            ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, filtersSetupActivity2.getThemedColor(iArr[i15 % iArr.length]));
            l10Var.e = i15;
            org.telegram.ui.ActionBar.f7.C(view2, K, org.telegram.ui.ActionBar.f7.N(iArr[i15 % iArr.length]), filtersSetupActivity2.getResourceProvider());
        }
        if (i15 != l10Var.d) {
            ValueAnimator valueAnimator = l10Var.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i13 == i14) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(imageView2.getAlpha(), i15 >= 0 ? 0.0f : 1.0f);
                l10Var.y = ofFloat;
                ofFloat.addUpdateListener(new b3(l10Var, 12));
                l10Var.y.setInterpolator(org.telegram.ui.Components.ds.h);
                l10Var.y.setDuration(340L);
                ValueAnimator valueAnimator2 = l10Var.y;
                if (i15 >= 0) {
                    max = Math.max(0, filtersSetupActivity2.v - i10);
                    j10 = 27;
                } else {
                    j10 = 27;
                    max = Math.max(0, i10 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j10);
                l10Var.y.start();
            } else {
                imageView2.setScaleX(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i15 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i15 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i15 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i15 >= 0 ? 1.0f : 0.0f);
            }
            l10Var.d = i15;
        }
        l10Var.n.setVisibility(dialogFilter.isChatlist() ? 0 : 8);
        StringBuilder sb2 = new StringBuilder();
        if (!dialogFilter.isDefault()) {
            int i16 = dialogFilter.flags;
            int i17 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
            if ((i16 & i17) != i17) {
                if ((i16 & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterContacts));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterNonContacts));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterGroups));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterChannels));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterBots));
                }
                if (dialogFilter.alwaysShow.isEmpty() || !dialogFilter.neverShow.isEmpty()) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.formatPluralString("Exception", dialogFilter.neverShow.size() + dialogFilter.alwaysShow.size(), new Object[0]));
                }
                if (sb2.length() == 0) {
                    sb2.append(LocaleController.getString(R.string.FilterNoChats));
                }
                String str = dialogFilter.name;
                if (dialogFilter.isDefault()) {
                    str = LocaleController.getString(R.string.FilterAllChats);
                }
                if (!z12) {
                    l10Var.w = l10Var.x.locked ? 1.0f : 0.0f;
                }
                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str, b6Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, b6Var.getPaint().getFontMetricsInt());
                b6Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
                b6Var.l(replaceAnimatedEmoji, false);
                l10Var.b.setText(sb2);
                l10Var.v = z10;
                if (dialogFilter.isDefault()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                l10Var.invalidate();
            }
        }
        sb2.append(LocaleController.getString(R.string.FilterAllChats));
        if (dialogFilter.alwaysShow.isEmpty()) {
        }
        if (sb2.length() != 0) {
        }
        sb2.append(LocaleController.formatPluralString("Exception", dialogFilter.neverShow.size() + dialogFilter.alwaysShow.size(), new Object[0]));
        if (sb2.length() == 0) {
        }
        String str2 = dialogFilter.name;
        if (dialogFilter.isDefault()) {
        }
        if (!z12) {
        }
        Spannable replaceAnimatedEmoji2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str2, b6Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, b6Var.getPaint().getFontMetricsInt());
        b6Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
        b6Var.l(replaceAnimatedEmoji2, false);
        l10Var.b.setText(sb2);
        l10Var.v = z10;
        if (dialogFilter.isDefault()) {
        }
        l10Var.invalidate();
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i10 != 0) {
            int i11 = 17;
            if (i10 != 1) {
                int i12 = 6;
                if (i10 != 2) {
                    if (i10 == 3) {
                        frameLayout = new org.telegram.ui.Cells.i9(context);
                    } else if (i10 == 4) {
                        r10 r10Var = new r10(context);
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
                        r10Var.a = b6Var;
                        b6Var.setTextSize(16);
                        b6Var.setGravity(LocaleController.isRTL ? 5 : 3);
                        int i13 = org.telegram.ui.ActionBar.y6.o6;
                        org.telegram.ui.ActionBar.f7.Y(b6Var, i13, null);
                        b6Var.setTag(Integer.valueOf(i13));
                        r10Var.addView(b6Var);
                        ImageView imageView = new ImageView(context);
                        r10Var.b = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        r10Var.addView(imageView);
                        frameLayout = r10Var;
                    } else if (i10 != 6) {
                        q10 q10Var = new q10(context);
                        TextView textView = new TextView(context);
                        q10Var.a = textView;
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
                        org.telegram.messenger.vh.r(textView, 1, 16.0f, 1, 1);
                        textView.setSingleLine(true);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView.setEllipsize(truncateAt);
                        textView.setGravity(LocaleController.isRTL ? 5 : 3);
                        q10Var.addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                        TextView textView2 = new TextView(context);
                        q10Var.b = textView2;
                        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.z6, null);
                        org.telegram.messenger.vh.r(textView2, 1, 13.0f, 1, 1);
                        textView2.setSingleLine(true);
                        textView2.setEllipsize(truncateAt);
                        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                        q10Var.addView(textView2, org.telegram.ui.Components.gb1.h(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                        org.telegram.ui.Components.wi0 wi0Var = new org.telegram.ui.Components.wi0(context);
                        q10Var.c = wi0Var;
                        wi0Var.setText(LocaleController.getString(R.string.Add));
                        org.telegram.ui.ActionBar.f7.V(wi0Var, org.telegram.ui.ActionBar.y6.Sh, null);
                        wi0Var.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Nh, false));
                        int i14 = org.telegram.ui.ActionBar.y6.Oh;
                        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i14, false);
                        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
                        wi0Var.setBackground(org.telegram.ui.ActionBar.o6.e(new float[]{14.0f}, x02));
                        Drawable background = wi0Var.getBackground();
                        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
                        wi0Var.setBackground(background);
                        org.telegram.ui.ActionBar.f7.k(wi0Var, background, N, null, null);
                        q10Var.addView(wi0Var, org.telegram.ui.Components.gb1.m(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                        q10Var.setAddOnClickListener(new org.telegram.ui.Components.k51(i11, this, q10Var));
                        frameLayout = q10Var;
                    } else {
                        frameLayout = new org.telegram.ui.Cells.a9(context);
                    }
                } else {
                    l10 l10Var = new l10(this.e, context);
                    l10Var.setOnReorderButtonTouchListener(new fi.o1(i12, this, l10Var));
                    l10Var.setOnOptionsClick(new a(this, 28));
                    frameLayout = l10Var;
                }
            } else {
                int i15 = R.raw.filters;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
                m10 m10Var = new m10(context);
                org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(context);
                m10Var.a = ak0Var;
                ak0Var.f(i15, 90, 90, null);
                ak0Var.setScaleType(ImageView.ScaleType.CENTER);
                ak0Var.d();
                ak0Var.setImportantForAccessibility(2);
                m10Var.addView(ak0Var, org.telegram.ui.Components.gb1.h(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                ak0Var.setOnClickListener(new a(m10Var, 27));
                TextView textView3 = new TextView(context);
                org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.B6, null);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(replaceTags);
                m10Var.addView(textView3, org.telegram.ui.Components.gb1.h(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                frameLayout = m10Var;
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.q4(context);
        }
        return new org.telegram.ui.Components.vl0(frameLayout);
    }
}
