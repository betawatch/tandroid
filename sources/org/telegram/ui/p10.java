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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class p10 extends pg.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public p10(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return (i10 == 3 || i10 == 0 || i10 == 5 || i10 == 1) ? false : true;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.n.size();
    }

    @Override // s4.g0
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

    /* JADX WARN: Removed duplicated region for block: B:143:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02cb  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        char c10;
        boolean z10;
        int i11;
        long j10;
        int max;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        n10 n10Var = (n10) arrayList.get(i10);
        if (n10Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z11 = i12 < arrayList.size() && ((n10) arrayList.get(i12)).a != 3;
        boolean z12 = i12 >= arrayList.size();
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 == 0) {
            ((org.telegram.ui.Cells.l4) view).setText(n10Var.c);
            return;
        }
        if (i13 != 2) {
            if (i13 == 3) {
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (TextUtils.isEmpty(n10Var.c)) {
                    e9Var.setText(null);
                    e9Var.setFixedSize(12);
                } else {
                    e9Var.setFixedSize(0);
                    e9Var.setText(n10Var.c);
                }
                e9Var.setBottomPadding(z12 ? 32 : 17);
                return;
            }
            if (i13 != 4) {
                if (i13 != 5) {
                    if (i13 != 6) {
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    w8Var.f(n10Var.c, filtersSetupActivity.getMessagesController().folderTags, z11);
                    w8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                    return;
                }
                q10 q10Var = (q10) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = n10Var.e;
                q10Var.d = z11;
                q10Var.e = tL_dialogFilterSuggested;
                q10Var.setWillNotDraw(!z11);
                q10Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                q10Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            r10 r10Var = (r10) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k7, false), mode));
            org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(drawable, drawable2);
            r10Var.a.l(((Object) n10Var.c) + "", false);
            r10Var.b.setImageDrawable(yqVar);
            return;
        }
        l10 l10Var = (l10) view;
        MessagesController.DialogFilter dialogFilter = n10Var.d;
        ImageView imageView = l10Var.h;
        org.telegram.ui.ActionBar.n5 n5Var = l10Var.a;
        ImageView imageView2 = l10Var.c;
        View view2 = l10Var.f;
        FiltersSetupActivity filtersSetupActivity2 = l10Var.H;
        MessagesController.DialogFilter dialogFilter2 = l10Var.x;
        int i14 = dialogFilter2 == null ? -1 : dialogFilter2.id;
        l10Var.x = dialogFilter;
        int i15 = dialogFilter == null ? -1 : dialogFilter.id;
        if (i14 != i15) {
            z10 = true;
            c10 = 1;
        } else {
            c10 = 1;
            z10 = false;
        }
        int i16 = filtersSetupActivity2.getMessagesController().folderTags ? dialogFilter.color : -1;
        if (i16 >= 0) {
            i11 = 0;
            if (dialogFilter.color != l10Var.e) {
                int dp = AndroidUtilities.dp(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.k6.r8;
                l10Var.e = i16;
                ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, filtersSetupActivity2.getThemedColor(iArr[i16 % iArr.length]));
                l10Var.e = i16;
                org.telegram.ui.ActionBar.r6.D(view2, K, org.telegram.ui.ActionBar.r6.O(iArr[i16 % iArr.length]), filtersSetupActivity2.getResourceProvider());
            }
        } else {
            i11 = 0;
        }
        if (i16 != l10Var.d) {
            ValueAnimator valueAnimator = l10Var.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i14 == i15) {
                float alpha = imageView2.getAlpha();
                float f7 = i16 >= 0 ? 0.0f : 1.0f;
                float[] fArr = new float[2];
                fArr[i11] = alpha;
                fArr[c10] = f7;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                l10Var.y = ofFloat;
                ofFloat.addUpdateListener(new d3(l10Var, 14));
                l10Var.y.setInterpolator(org.telegram.ui.Components.bs.h);
                l10Var.y.setDuration(340L);
                ValueAnimator valueAnimator2 = l10Var.y;
                if (i16 >= 0) {
                    max = Math.max(i11, filtersSetupActivity2.v - i10);
                    j10 = 27;
                } else {
                    j10 = 27;
                    max = Math.max(i11, i10 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j10);
                l10Var.y.start();
            } else {
                imageView2.setScaleX(i16 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i16 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i16 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i16 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i16 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i16 >= 0 ? 1.0f : 0.0f);
            }
            l10Var.d = i16;
        }
        l10Var.n.setVisibility(dialogFilter.isChatlist() ? 0 : 8);
        StringBuilder sb2 = new StringBuilder();
        if (!dialogFilter.isDefault()) {
            int i17 = dialogFilter.flags;
            int i18 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
            if ((i17 & i18) != i18) {
                if ((i17 & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
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
                if (!z10) {
                    l10Var.w = l10Var.x.locked ? 1.0f : 0.0f;
                }
                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str, n5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, n5Var.getPaint().getFontMetricsInt());
                n5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
                n5Var.l(replaceAnimatedEmoji, false);
                l10Var.b.setText(sb2);
                l10Var.v = z11;
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
        if (!z10) {
        }
        Spannable replaceAnimatedEmoji2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str2, n5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, n5Var.getPaint().getFontMetricsInt());
        n5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
        n5Var.l(replaceAnimatedEmoji2, false);
        l10Var.b.setText(sb2);
        l10Var.v = z11;
        if (dialogFilter.isDefault()) {
        }
        l10Var.invalidate();
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i10 != 0) {
            int i11 = 17;
            if (i10 != 1) {
                int i12 = 6;
                if (i10 != 2) {
                    if (i10 == 3) {
                        frameLayout = new org.telegram.ui.Cells.e9(context);
                    } else if (i10 == 4) {
                        r10 r10Var = new r10(context);
                        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
                        r10Var.a = n5Var;
                        n5Var.setTextSize(16);
                        n5Var.setGravity(LocaleController.isRTL ? 5 : 3);
                        int i13 = org.telegram.ui.ActionBar.k6.o6;
                        org.telegram.ui.ActionBar.r6.Z(n5Var, i13, null);
                        n5Var.setTag(Integer.valueOf(i13));
                        r10Var.addView(n5Var);
                        ImageView imageView = new ImageView(context);
                        r10Var.b = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        r10Var.addView(imageView);
                        frameLayout = r10Var;
                    } else if (i10 != 6) {
                        q10 q10Var = new q10(context);
                        TextView textView = new TextView(context);
                        q10Var.a = textView;
                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, null);
                        org.telegram.messenger.sl.u(textView, 1, 16.0f, 1, 1);
                        textView.setSingleLine(true);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView.setEllipsize(truncateAt);
                        textView.setGravity(LocaleController.isRTL ? 5 : 3);
                        q10Var.addView(textView, w7.z5.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                        TextView textView2 = new TextView(context);
                        q10Var.b = textView2;
                        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.z6, null);
                        org.telegram.messenger.sl.u(textView2, 1, 13.0f, 1, 1);
                        textView2.setSingleLine(true);
                        textView2.setEllipsize(truncateAt);
                        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                        q10Var.addView(textView2, w7.z5.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(context);
                        q10Var.c = xi0Var;
                        xi0Var.setText(LocaleController.getString(R.string.Add));
                        org.telegram.ui.ActionBar.r6.W(xi0Var, org.telegram.ui.ActionBar.k6.Sh, null);
                        xi0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Nh, false));
                        int i14 = org.telegram.ui.ActionBar.k6.Oh;
                        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
                        xi0Var.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{14.0f}, x02));
                        Drawable background = xi0Var.getBackground();
                        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
                        xi0Var.setBackground(background);
                        org.telegram.ui.ActionBar.r6.k(xi0Var, background, O, null, null);
                        q10Var.addView(xi0Var, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                        q10Var.setAddOnClickListener(new org.telegram.ui.Components.d51(i11, this, q10Var));
                        frameLayout = q10Var;
                    } else {
                        frameLayout = new org.telegram.ui.Cells.w8(context);
                    }
                } else {
                    l10 l10Var = new l10(this.e, context);
                    l10Var.setOnReorderButtonTouchListener(new ei.p1(i12, this, l10Var));
                    l10Var.setOnOptionsClick(new a(this, 28));
                    frameLayout = l10Var;
                }
            } else {
                int i15 = R.raw.filters;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
                m10 m10Var = new m10(context);
                org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
                m10Var.a = bk0Var;
                bk0Var.f(i15, 90, 90, null);
                bk0Var.setScaleType(ImageView.ScaleType.CENTER);
                bk0Var.d();
                bk0Var.setImportantForAccessibility(2);
                m10Var.addView(bk0Var, w7.z5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                bk0Var.setOnClickListener(new a(m10Var, 27));
                TextView textView3 = new TextView(context);
                org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.B6, null);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(replaceTags);
                m10Var.addView(textView3, w7.z5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                frameLayout = m10Var;
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.l4(context);
        }
        return new org.telegram.ui.Components.wl0(frameLayout);
    }
}
