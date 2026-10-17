package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class n10 extends pg.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public n10(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.hm0
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
        l10 l10Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 < filtersSetupActivity.n.size() && (l10Var = (l10) filtersSetupActivity.n.get(i10)) != null) {
                return l10Var.a;
            }
            return 3;
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02bc  */
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
        l10 l10Var = (l10) arrayList.get(i10);
        if (l10Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z11 = i12 < arrayList.size() && ((l10) arrayList.get(i12)).a != 3;
        boolean z12 = i12 >= arrayList.size();
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 == 0) {
            ((org.telegram.ui.Cells.l4) view).setText(l10Var.c);
            return;
        }
        if (i13 != 2) {
            if (i13 == 3) {
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                if (TextUtils.isEmpty(l10Var.c)) {
                    d9Var.setText(null);
                    d9Var.setFixedSize(12);
                } else {
                    d9Var.setFixedSize(0);
                    d9Var.setText(l10Var.c);
                }
                d9Var.setBottomPadding(z12 ? 32 : 17);
                return;
            }
            if (i13 != 4) {
                if (i13 != 5) {
                    if (i13 != 6) {
                        return;
                    }
                    org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                    v8Var.f(l10Var.c, filtersSetupActivity.getMessagesController().folderTags, z11);
                    v8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                    return;
                }
                o10 o10Var = (o10) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = l10Var.e;
                o10Var.d = z11;
                o10Var.e = tL_dialogFilterSuggested;
                o10Var.setWillNotDraw(!z11);
                o10Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                o10Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            p10 p10Var = (p10) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.k7, false), mode));
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(drawable, drawable2);
            p10Var.a.l(((Object) l10Var.c) + "", false);
            p10Var.b.setImageDrawable(zqVar);
            return;
        }
        j10 j10Var = (j10) view;
        MessagesController.DialogFilter dialogFilter = l10Var.d;
        ImageView imageView = j10Var.h;
        org.telegram.ui.ActionBar.j5 j5Var = j10Var.a;
        ImageView imageView2 = j10Var.c;
        View view2 = j10Var.f;
        FiltersSetupActivity filtersSetupActivity2 = j10Var.E;
        MessagesController.DialogFilter dialogFilter2 = j10Var.x;
        int i14 = dialogFilter2 == null ? -1 : dialogFilter2.id;
        j10Var.x = dialogFilter;
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
            if (dialogFilter.color != j10Var.e) {
                int dp = AndroidUtilities.dp(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.h6.r8;
                j10Var.e = i16;
                view2.setBackground(org.telegram.ui.ActionBar.h6.K(dp, filtersSetupActivity2.getThemedColor(iArr[i16 % iArr.length])));
            }
        } else {
            i11 = 0;
        }
        if (i16 != j10Var.d) {
            ValueAnimator valueAnimator = j10Var.y;
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
                j10Var.y = ofFloat;
                ofFloat.addUpdateListener(new e3(j10Var, 14));
                j10Var.y.setInterpolator(org.telegram.ui.Components.bs.h);
                j10Var.y.setDuration(340L);
                ValueAnimator valueAnimator2 = j10Var.y;
                if (i16 >= 0) {
                    max = Math.max(i11, filtersSetupActivity2.v - i10);
                    j10 = 27;
                } else {
                    j10 = 27;
                    max = Math.max(i11, i10 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j10);
                j10Var.y.start();
            } else {
                imageView2.setScaleX(i16 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i16 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i16 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i16 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i16 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i16 >= 0 ? 1.0f : 0.0f);
            }
            j10Var.d = i16;
        }
        j10Var.n.setVisibility(dialogFilter.isChatlist() ? 0 : 8);
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
                    j10Var.w = j10Var.x.locked ? 1.0f : 0.0f;
                }
                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str, j5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, j5Var.getPaint().getFontMetricsInt());
                j5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
                j5Var.l(replaceAnimatedEmoji, false);
                j10Var.b.setText(sb2);
                j10Var.v = z11;
                if (dialogFilter.isDefault()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                j10Var.invalidate();
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
        Spannable replaceAnimatedEmoji2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str2, j5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, j5Var.getPaint().getFontMetricsInt());
        j5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
        j5Var.l(replaceAnimatedEmoji2, false);
        j10Var.b.setText(sb2);
        j10Var.v = z11;
        if (dialogFilter.isDefault()) {
        }
        j10Var.invalidate();
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.l4(context);
        } else if (i10 != 1) {
            int i11 = 6;
            if (i10 != 2) {
                if (i10 != 3) {
                    int i12 = 16;
                    if (i10 == 4) {
                        p10 p10Var = new p10(context);
                        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                        p10Var.a = j5Var;
                        j5Var.setTextSize(16);
                        j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
                        int i13 = org.telegram.ui.ActionBar.h6.o6;
                        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                        j5Var.setTag(Integer.valueOf(i13));
                        p10Var.addView(j5Var);
                        ImageView imageView = new ImageView(context);
                        p10Var.b = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        p10Var.addView(imageView);
                        frameLayout = p10Var;
                    } else if (i10 != 6) {
                        o10 o10Var = new o10(context);
                        TextView textView = new TextView(context);
                        o10Var.a = textView;
                        org.telegram.messenger.wh.u(textView, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f, 1);
                        textView.setMaxLines(1);
                        textView.setSingleLine(true);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView.setEllipsize(truncateAt);
                        textView.setGravity(LocaleController.isRTL ? 5 : 3);
                        o10Var.addView(textView, w7.z5.a(-2.0f, 22.0f, 10.0f, 22.0f, 0.0f, -2, LocaleController.isRTL ? 5 : 3));
                        TextView textView2 = new TextView(context);
                        o10Var.b = textView2;
                        org.telegram.messenger.wh.u(textView2, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.z6, false), 1, 13.0f, 1);
                        textView2.setMaxLines(1);
                        textView2.setSingleLine(true);
                        textView2.setEllipsize(truncateAt);
                        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                        o10Var.addView(textView2, w7.z5.a(-2.0f, 22.0f, 35.0f, 22.0f, 0.0f, -2, LocaleController.isRTL ? 5 : 3));
                        org.telegram.ui.Components.ti0 ti0Var = new org.telegram.ui.Components.ti0(context);
                        o10Var.c = ti0Var;
                        ti0Var.setText(LocaleController.getString(R.string.Add));
                        ti0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                        ti0Var.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Nh, false));
                        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                        ti0Var.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{14.0f}, x02));
                        o10Var.addView(ti0Var, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                        o10Var.setAddOnClickListener(new org.telegram.ui.Components.g51(i12, this, o10Var));
                        frameLayout = o10Var;
                    } else {
                        frameLayout = new org.telegram.ui.Cells.v8(context);
                    }
                } else {
                    frameLayout = new org.telegram.ui.Cells.d9(context);
                }
            } else {
                j10 j10Var = new j10(this.e, context);
                j10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                j10Var.setOnReorderButtonTouchListener(new ei.p1(i11, this, j10Var));
                j10Var.setOnOptionsClick(new a(this, 27));
                frameLayout = j10Var;
            }
        } else {
            int i14 = R.raw.filters;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
            k10 k10Var = new k10(context);
            org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(context);
            k10Var.a = xj0Var;
            xj0Var.f(i14, 90, 90, null);
            xj0Var.setScaleType(ImageView.ScaleType.CENTER);
            xj0Var.d();
            xj0Var.setImportantForAccessibility(2);
            k10Var.addView(xj0Var, w7.z5.a(90.0f, 0.0f, 14.0f, 0.0f, 0.0f, 90, 49));
            xj0Var.setOnClickListener(new a(k10Var, 26));
            TextView textView3 = new TextView(context);
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B6, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(replaceTags);
            k10Var.addView(textView3, w7.z5.a(-2.0f, 40.0f, 121.0f, 40.0f, 24.0f, -1, 49));
            frameLayout = k10Var;
        }
        return new org.telegram.ui.Components.sl0(frameLayout);
    }
}
