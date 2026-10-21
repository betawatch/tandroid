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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class l10 extends pg.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public l10(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.im0
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
        j10 j10Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 < filtersSetupActivity.n.size() && (j10Var = (j10) filtersSetupActivity.n.get(i10)) != null) {
                return j10Var.a;
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
        j10 j10Var = (j10) arrayList.get(i10);
        if (j10Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z11 = i12 < arrayList.size() && ((j10) arrayList.get(i12)).a != 3;
        boolean z12 = i12 >= arrayList.size();
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 == 0) {
            ((org.telegram.ui.Cells.l4) view).setText(j10Var.c);
            return;
        }
        if (i13 != 2) {
            if (i13 == 3) {
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                if (TextUtils.isEmpty(j10Var.c)) {
                    d9Var.setText(null);
                    d9Var.setFixedSize(12);
                } else {
                    d9Var.setFixedSize(0);
                    d9Var.setText(j10Var.c);
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
                    v8Var.f(j10Var.c, filtersSetupActivity.getMessagesController().folderTags, z11);
                    v8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                    return;
                }
                m10 m10Var = (m10) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = j10Var.e;
                m10Var.d = z11;
                m10Var.e = tL_dialogFilterSuggested;
                m10Var.setWillNotDraw(!z11);
                m10Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                m10Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            n10 n10Var = (n10) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.k7, false), mode));
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(drawable, drawable2);
            n10Var.a.l(((Object) j10Var.c) + "", false);
            n10Var.b.setImageDrawable(zqVar);
            return;
        }
        h10 h10Var = (h10) view;
        MessagesController.DialogFilter dialogFilter = j10Var.d;
        ImageView imageView = h10Var.h;
        org.telegram.ui.ActionBar.j5 j5Var = h10Var.a;
        ImageView imageView2 = h10Var.c;
        View view2 = h10Var.f;
        FiltersSetupActivity filtersSetupActivity2 = h10Var.E;
        MessagesController.DialogFilter dialogFilter2 = h10Var.x;
        int i14 = dialogFilter2 == null ? -1 : dialogFilter2.id;
        h10Var.x = dialogFilter;
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
            if (dialogFilter.color != h10Var.e) {
                int dp = AndroidUtilities.dp(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.h6.r8;
                h10Var.e = i16;
                view2.setBackground(org.telegram.ui.ActionBar.h6.K(dp, filtersSetupActivity2.getThemedColor(iArr[i16 % iArr.length])));
            }
        } else {
            i11 = 0;
        }
        if (i16 != h10Var.d) {
            ValueAnimator valueAnimator = h10Var.y;
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
                h10Var.y = ofFloat;
                ofFloat.addUpdateListener(new e3(h10Var, 14));
                h10Var.y.setInterpolator(org.telegram.ui.Components.bs.h);
                h10Var.y.setDuration(340L);
                ValueAnimator valueAnimator2 = h10Var.y;
                if (i16 >= 0) {
                    max = Math.max(i11, filtersSetupActivity2.v - i10);
                    j10 = 27;
                } else {
                    j10 = 27;
                    max = Math.max(i11, i10 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j10);
                h10Var.y.start();
            } else {
                imageView2.setScaleX(i16 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i16 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i16 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i16 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i16 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i16 >= 0 ? 1.0f : 0.0f);
            }
            h10Var.d = i16;
        }
        h10Var.n.setVisibility(dialogFilter.isChatlist() ? 0 : 8);
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
                    h10Var.w = h10Var.x.locked ? 1.0f : 0.0f;
                }
                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str, j5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, j5Var.getPaint().getFontMetricsInt());
                j5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
                j5Var.l(replaceAnimatedEmoji, false);
                h10Var.b.setText(sb2);
                h10Var.v = z11;
                if (dialogFilter.isDefault()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                h10Var.invalidate();
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
        h10Var.b.setText(sb2);
        h10Var.v = z11;
        if (dialogFilter.isDefault()) {
        }
        h10Var.invalidate();
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
                        n10 n10Var = new n10(context);
                        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                        n10Var.a = j5Var;
                        j5Var.setTextSize(16);
                        j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
                        int i13 = org.telegram.ui.ActionBar.h6.o6;
                        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                        j5Var.setTag(Integer.valueOf(i13));
                        n10Var.addView(j5Var);
                        ImageView imageView = new ImageView(context);
                        n10Var.b = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        n10Var.addView(imageView);
                        frameLayout = n10Var;
                    } else if (i10 != 6) {
                        m10 m10Var = new m10(context);
                        TextView textView = new TextView(context);
                        m10Var.a = textView;
                        org.telegram.messenger.mk.u(textView, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f, 1);
                        textView.setMaxLines(1);
                        textView.setSingleLine(true);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView.setEllipsize(truncateAt);
                        textView.setGravity(LocaleController.isRTL ? 5 : 3);
                        m10Var.addView(textView, w7.z5.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                        TextView textView2 = new TextView(context);
                        m10Var.b = textView2;
                        org.telegram.messenger.mk.u(textView2, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.z6, false), 1, 13.0f, 1);
                        textView2.setMaxLines(1);
                        textView2.setSingleLine(true);
                        textView2.setEllipsize(truncateAt);
                        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                        m10Var.addView(textView2, w7.z5.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                        org.telegram.ui.Components.ui0 ui0Var = new org.telegram.ui.Components.ui0(context);
                        m10Var.c = ui0Var;
                        ui0Var.setText(LocaleController.getString(R.string.Add));
                        ui0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                        ui0Var.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Nh, false));
                        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                        ui0Var.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{14.0f}, x02));
                        m10Var.addView(ui0Var, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                        m10Var.setAddOnClickListener(new org.telegram.ui.Components.i51(i12, this, m10Var));
                        frameLayout = m10Var;
                    } else {
                        frameLayout = new org.telegram.ui.Cells.v8(context);
                    }
                } else {
                    frameLayout = new org.telegram.ui.Cells.d9(context);
                }
            } else {
                h10 h10Var = new h10(this.e, context);
                h10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                h10Var.setOnReorderButtonTouchListener(new ei.p1(i11, this, h10Var));
                h10Var.setOnOptionsClick(new a(this, 28));
                frameLayout = h10Var;
            }
        } else {
            int i14 = R.raw.filters;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
            i10 i10Var = new i10(context);
            org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(context);
            i10Var.a = yj0Var;
            yj0Var.f(i14, 90, 90, null);
            yj0Var.setScaleType(ImageView.ScaleType.CENTER);
            yj0Var.d();
            yj0Var.setImportantForAccessibility(2);
            i10Var.addView(yj0Var, w7.z5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            yj0Var.setOnClickListener(new a(i10Var, 27));
            TextView textView3 = new TextView(context);
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B6, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(replaceTags);
            i10Var.addView(textView3, w7.z5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            frameLayout = i10Var;
        }
        return new org.telegram.ui.Components.tl0(frameLayout);
    }
}
