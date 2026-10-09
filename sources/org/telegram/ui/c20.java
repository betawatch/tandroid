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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class c20 extends og.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public c20(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f;
        return (i10 == 3 || i10 == 0 || i10 == 5 || i10 == 1) ? false : true;
    }

    @Override // s4.i0
    public final int h() {
        return this.e.n.size();
    }

    @Override // s4.i0
    public final int j(int i10) {
        a20 a20Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 < filtersSetupActivity.n.size() && (a20Var = (a20) filtersSetupActivity.n.get(i10)) != null) {
                return a20Var.a;
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
    @Override // s4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.d1 d1Var, int i10) {
        char c10;
        boolean z10;
        int i11;
        long j3;
        int max;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        a20 a20Var = (a20) arrayList.get(i10);
        if (a20Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z11 = i12 < arrayList.size() && ((a20) arrayList.get(i12)).a != 3;
        boolean z12 = i12 >= arrayList.size();
        int i13 = d1Var.f;
        View view = d1Var.a;
        if (i13 == 0) {
            ((org.telegram.ui.Cells.m4) view).setText(a20Var.c);
            return;
        }
        if (i13 != 2) {
            if (i13 == 3) {
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (TextUtils.isEmpty(a20Var.c)) {
                    e9Var.setText(null);
                    e9Var.setFixedSize(12);
                } else {
                    e9Var.setFixedSize(0);
                    e9Var.setText(a20Var.c);
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
                    w8Var.f(a20Var.c, filtersSetupActivity.getMessagesController().folderTags, z11);
                    w8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                    return;
                }
                d20 d20Var = (d20) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = a20Var.e;
                d20Var.d = z11;
                d20Var.e = tL_dialogFilterSuggested;
                d20Var.setWillNotDraw(!z11);
                d20Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                d20Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            e20 e20Var = (e20) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.k7, false), mode));
            org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(drawable, drawable2);
            e20Var.a.l(((Object) a20Var.c) + "", false);
            e20Var.b.setImageDrawable(frVar);
            return;
        }
        y10 y10Var = (y10) view;
        MessagesController.DialogFilter dialogFilter = a20Var.d;
        ImageView imageView = y10Var.h;
        org.telegram.ui.ActionBar.j5 j5Var = y10Var.a;
        ImageView imageView2 = y10Var.c;
        View view2 = y10Var.f;
        FiltersSetupActivity filtersSetupActivity2 = y10Var.E;
        MessagesController.DialogFilter dialogFilter2 = y10Var.x;
        int i14 = dialogFilter2 == null ? -1 : dialogFilter2.id;
        y10Var.x = dialogFilter;
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
            if (dialogFilter.color != y10Var.e) {
                int dp = AndroidUtilities.dp(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.i6.r8;
                y10Var.e = i16;
                view2.setBackground(org.telegram.ui.ActionBar.i6.K(dp, filtersSetupActivity2.getThemedColor(iArr[i16 % iArr.length])));
            }
        } else {
            i11 = 0;
        }
        if (i16 != y10Var.d) {
            ValueAnimator valueAnimator = y10Var.y;
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
                y10Var.y = ofFloat;
                ofFloat.addUpdateListener(new c3(y10Var, 14));
                y10Var.y.setInterpolator(org.telegram.ui.Components.hs.h);
                y10Var.y.setDuration(340L);
                ValueAnimator valueAnimator2 = y10Var.y;
                if (i16 >= 0) {
                    max = Math.max(i11, filtersSetupActivity2.v - i10);
                    j3 = 27;
                } else {
                    j3 = 27;
                    max = Math.max(i11, i10 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j3);
                y10Var.y.start();
            } else {
                imageView2.setScaleX(i16 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i16 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i16 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i16 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i16 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i16 >= 0 ? 1.0f : 0.0f);
            }
            y10Var.d = i16;
        }
        y10Var.n.setVisibility(dialogFilter.isChatlist() ? 0 : 8);
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
                    y10Var.w = y10Var.x.locked ? 1.0f : 0.0f;
                }
                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str, j5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, j5Var.getPaint().getFontMetricsInt());
                j5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
                j5Var.l(replaceAnimatedEmoji, false);
                y10Var.b.setText(sb2);
                y10Var.v = z11;
                if (dialogFilter.isDefault()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                y10Var.invalidate();
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
        y10Var.b.setText(sb2);
        y10Var.v = z11;
        if (dialogFilter.isDefault()) {
        }
        y10Var.invalidate();
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.m4(context);
        } else if (i10 != 1) {
            int i11 = 6;
            if (i10 != 2) {
                if (i10 == 3) {
                    frameLayout = new org.telegram.ui.Cells.e9(context);
                } else if (i10 == 4) {
                    e20 e20Var = new e20(context);
                    org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                    e20Var.a = j5Var;
                    j5Var.setTextSize(16);
                    j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
                    int i12 = org.telegram.ui.ActionBar.i6.o6;
                    j5Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
                    j5Var.setTag(Integer.valueOf(i12));
                    e20Var.addView(j5Var);
                    ImageView imageView = new ImageView(context);
                    e20Var.b = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    e20Var.addView(imageView);
                    frameLayout = e20Var;
                } else if (i10 != 6) {
                    d20 d20Var = new d20(context);
                    TextView textView = new TextView(context);
                    d20Var.a = textView;
                    org.telegram.messenger.bi.u(textView, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                    d20Var.addView(textView, w7.x5.a(-2.0f, 22.0f, 10.0f, 22.0f, 0.0f, -2, LocaleController.isRTL ? 5 : 3));
                    TextView textView2 = new TextView(context);
                    d20Var.b = textView2;
                    org.telegram.messenger.bi.u(textView2, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.z6, false), 1, 13.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                    d20Var.addView(textView2, w7.x5.a(-2.0f, 22.0f, 35.0f, 22.0f, 0.0f, -2, LocaleController.isRTL ? 5 : 3));
                    org.telegram.ui.Components.cj0 cj0Var = new org.telegram.ui.Components.cj0(context);
                    d20Var.c = cj0Var;
                    cj0Var.setText(LocaleController.getString(R.string.Add));
                    cj0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                    cj0Var.setProgressColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Nh, false));
                    int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
                    org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
                    cj0Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{14.0f}, x02));
                    d20Var.addView(cj0Var, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                    d20Var.setAddOnClickListener(new rv(i11, this, d20Var));
                    frameLayout = d20Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.w8(context);
                }
            } else {
                y10 y10Var = new y10(this.e, context);
                y10Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
                y10Var.setOnReorderButtonTouchListener(new ci.p1(i11, this, y10Var));
                y10Var.setOnOptionsClick(new a(this, 27));
                frameLayout = y10Var;
            }
        } else {
            int i13 = R.raw.filters;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
            z10 z10Var = new z10(context);
            org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(context);
            z10Var.a = fk0Var;
            fk0Var.f(i13, 90, 90, null);
            fk0Var.setScaleType(ImageView.ScaleType.CENTER);
            fk0Var.d();
            fk0Var.setImportantForAccessibility(2);
            z10Var.addView(fk0Var, w7.x5.a(90.0f, 0.0f, 14.0f, 0.0f, 0.0f, 90, 49));
            fk0Var.setOnClickListener(new a(z10Var, 26));
            TextView textView3 = new TextView(context);
            textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.B6, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(replaceTags);
            z10Var.addView(textView3, w7.x5.a(-2.0f, 40.0f, 121.0f, 40.0f, 24.0f, -1, 49));
            frameLayout = z10Var;
        }
        return new org.telegram.ui.Components.am0(frameLayout);
    }
}
