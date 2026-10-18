package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class a7 extends pg.b {
    public final Context d;
    public final /* synthetic */ c7 e;

    public a7(c7 c7Var, Context context) {
        this.e = c7Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        long b10 = b1Var.b();
        c7 c7Var = this.e;
        if (b10 == c7Var.K) {
            return true;
        }
        int i10 = b1Var.f;
        return (i10 == 2 && c7Var.H > 0 && !c7Var.L) || i10 == 5 || i10 == 7 || i10 == 11;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.a0.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((x6) this.e.a0.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        c7 c7Var = this.e;
        ArrayList arrayList = c7Var.a0;
        x6 x6Var = (x6) arrayList.get(i10);
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            if (i10 == c7Var.K) {
                baVar.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
                return;
            }
            return;
        }
        if (i12 == 1) {
            ((org.telegram.ui.Cells.d9) view).setText(AndroidUtilities.replaceTags(x6Var.e));
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                l4Var.setText(((x6) arrayList.get(i10)).d);
                ((x6) arrayList.get(i10)).getClass();
                l4Var.setTopMargin(15);
                ((x6) arrayList.get(i10)).getClass();
                l4Var.setBottomMargin(0);
                return;
            }
            int i13 = 7;
            if (i12 == 7) {
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                CacheByChatsController cacheByChatsController = c7Var.getMessagesController().getCacheByChatsController();
                int i14 = x6Var.c;
                int size = cacheByChatsController.getKeepMediaExceptions(((x6) arrayList.get(i10)).c).size();
                String formatPluralString = size > 0 ? LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size)) : null;
                String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i14));
                if (((x6) arrayList.get(i10)).c == 0) {
                    q8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                } else if (((x6) arrayList.get(i10)).c == 1) {
                    q8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                } else if (((x6) arrayList.get(i10)).c == 2) {
                    q8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                } else if (((x6) arrayList.get(i10)).c == 3) {
                    q8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                }
                q8Var.setSubtitle(formatPluralString);
                return;
            }
            switch (i12) {
                case 9:
                    c7Var.v0();
                    break;
                case 10:
                    n6 n6Var = c7Var.R;
                    if (n6Var != null && !c7Var.L) {
                        long j10 = c7Var.H;
                        boolean z10 = j10 > 0;
                        long j11 = c7Var.I;
                        n6Var.b(j11 <= 0 ? 0.0f : j10 / j11, (c7Var.J <= 0 || j11 <= 0) ? 0.0f : (j11 - r9) / j11, z10);
                        break;
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                    int i15 = x6Var.f;
                    boolean r02 = i15 < 0 ? c7Var.r0() : c7Var.e[i15];
                    CharSequence charSequence = x6Var.d;
                    int[] iArr = c7Var.O;
                    int i16 = x6Var.f;
                    if (i16 < 0) {
                        i16 = 9;
                    }
                    int i17 = iArr[i16];
                    SpannableString spannableString = new SpannableString(i17 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i17)));
                    spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.c61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    spannableStringBuilder.append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) spannableString);
                    a2Var.e(spannableStringBuilder, AndroidUtilities.formatFileSize(x6Var.g), r02, x6Var.f >= 0 ? !x6Var.j : !c7Var.M, false);
                    int i18 = x6Var.h;
                    int i19 = org.telegram.ui.ActionBar.h6.k7;
                    org.telegram.ui.Components.xp xpVar = a2Var.r;
                    if (xpVar != null) {
                        xpVar.b(i18, i18, i19);
                    }
                    a2Var.setCollapsed(x6Var.f < 0 ? Boolean.valueOf(c7Var.M) : null);
                    if (x6Var.f == -1) {
                        a2Var.d(new a(this, i13), new org.telegram.ui.ActionBar.s1(5, this, a2Var));
                    } else {
                        a2Var.d(null, null);
                    }
                    a2Var.setPad(x6Var.i ? 1 : 0);
                    break;
            }
            return;
        }
        final org.telegram.ui.Components.xy0 xy0Var = (org.telegram.ui.Components.xy0) view;
        boolean z11 = c7Var.L;
        long j12 = c7Var.f;
        long j13 = c7Var.H;
        long j14 = c7Var.J;
        long j15 = c7Var.I;
        c2.b bVar = xy0Var.I;
        View view2 = xy0Var.w;
        TextView textView = xy0Var.n;
        TextView textView2 = xy0Var.h;
        TextView textView3 = xy0Var.v;
        org.telegram.ui.Cells.ba baVar2 = xy0Var.y;
        xy0Var.e = z11;
        TextView textView4 = xy0Var.r;
        textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j14)));
        TextView textView5 = xy0Var.s;
        long j16 = j15 - j14;
        textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j16)));
        if (z11) {
            textView3.setVisibility(0);
            textView2.setVisibility(8);
            textView4.setVisibility(8);
            textView5.setVisibility(8);
            textView.setVisibility(8);
            view2.setVisibility(8);
            baVar2.setVisibility(8);
            xy0Var.E = 0.0f;
            xy0Var.F = 0.0f;
            if (bVar != null) {
                bVar.c(textView3);
            }
        } else {
            if (bVar != null) {
                bVar.v(textView3);
            }
            textView3.setVisibility(8);
            if (j13 > 0) {
                i11 = 0;
                view2.setVisibility(0);
                baVar2.setVisibility(0);
                textView2.setVisibility(0);
                textView.setVisibility(8);
                baVar2.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j13), false, true);
                textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j13 + j12)));
            } else {
                i11 = 0;
                textView2.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j12)));
                view2.setVisibility(8);
                baVar2.setVisibility(8);
            }
            textView4.setVisibility(i11);
            textView5.setVisibility(i11);
            float f7 = j15;
            float f10 = (j13 + j12) / f7;
            float f11 = j16 / f7;
            if (xy0Var.E != f10) {
                ValueAnimator valueAnimator = xy0Var.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                final int i20 = 0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(xy0Var.E, f10);
                xy0Var.G = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.wy0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i20) {
                            case 0:
                                xy0 xy0Var2 = xy0Var;
                                xy0Var2.getClass();
                                xy0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                xy0Var2.invalidate();
                                break;
                            default:
                                xy0 xy0Var3 = xy0Var;
                                xy0Var3.getClass();
                                xy0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                xy0Var3.invalidate();
                                break;
                        }
                    }
                });
                xy0Var.G.start();
            }
            if (xy0Var.F != f11) {
                ValueAnimator valueAnimator2 = xy0Var.H;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                final int i21 = 1;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(xy0Var.F, f11);
                xy0Var.H = ofFloat2;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.wy0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        switch (i21) {
                            case 0:
                                xy0 xy0Var2 = xy0Var;
                                xy0Var2.getClass();
                                xy0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                xy0Var2.invalidate();
                                break;
                            default:
                                xy0 xy0Var3 = xy0Var;
                                xy0Var3.getClass();
                                xy0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                xy0Var3.invalidate();
                                break;
                        }
                    }
                });
                xy0Var.H.start();
            }
        }
        baVar2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        xy0Var.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.d;
        if (i10 != 0) {
            int i11 = 0;
            c7 c7Var = this.e;
            switch (i10) {
                case 2:
                    org.telegram.ui.Components.xy0 xy0Var = new org.telegram.ui.Components.xy0(context);
                    Paint paint = new Paint(1);
                    xy0Var.a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    xy0Var.b = paint3;
                    Paint paint4 = new Paint(1);
                    xy0Var.c = paint4;
                    xy0Var.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    xy0Var.L = hVar;
                    xy0Var.setWillNotDraw(false);
                    hVar.k = false;
                    paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint3.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint4.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    Paint.Cap cap = Paint.Cap.ROUND;
                    paint.setStrokeCap(cap);
                    paint2.setStrokeCap(cap);
                    paint3.setStrokeCap(cap);
                    paint4.setStrokeCap(cap);
                    ai.ic icVar = new ai.ic(xy0Var, context, 27);
                    xy0Var.f = icVar;
                    xy0Var.addView(icVar, w7.z5.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    xy0Var.addView(linearLayout, w7.z5.c(-2.0f, -1));
                    ci.h4 h4Var = new ci.h4(context, 20);
                    linearLayout.addView(h4Var, w7.z5.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    xy0Var.v = textView;
                    int i12 = org.telegram.ui.ActionBar.h6.y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        c2.b bVar = new c2.b(textView);
                        xy0Var.I = bVar;
                        bVar.A(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    xy0Var.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                    TextView textView3 = new TextView(context);
                    xy0Var.n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    xy0Var.r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    xy0Var.s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                    xy0Var.x = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), xy0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), i0.a.o(xy0Var.x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), i0.a.o(xy0Var.x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), xy0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    h4Var.addView(textView, w7.z5.c(-2.0f, -2));
                    h4Var.addView(textView3, w7.z5.c(-2.0f, -2));
                    h4Var.addView(textView2, w7.z5.c(-2.0f, -2));
                    h4Var.addView(textView5, w7.z5.c(-2.0f, -2));
                    h4Var.addView(textView4, w7.z5.c(-2.0f, -2));
                    View view = new View(xy0Var.getContext());
                    xy0Var.w = view;
                    linearLayout.addView(view, w7.z5.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d7, false));
                    org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(xy0Var.getContext());
                    xy0Var.y = baVar;
                    linearLayout.addView(baVar, w7.z5.n(-1, -2));
                    frameLayout = xy0Var;
                    break;
                case 3:
                    frameLayout = new org.telegram.ui.Cells.l4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.nw0 nw0Var = new org.telegram.ui.Components.nw0(context, null);
                    nw0Var.setCallback(new m4.v0(18));
                    int i13 = SharedConfig.keepMedia;
                    nw0Var.b(i13 == 3 ? 0 : i13 + 1, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    frameLayout = nw0Var;
                    break;
                case 5:
                    frameLayout = new b7(c7Var.getParentActivity(), c7Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(c7Var.getParentActivity(), null);
                    b10Var.setIsSingleCell(true);
                    b10Var.setItemsCount(3);
                    b10Var.setIgnoreHeightCheck(true);
                    b10Var.setViewType(25);
                    frameLayout = b10Var;
                    break;
                case 7:
                    frameLayout = new org.telegram.ui.Cells.q8(context);
                    break;
                case 8:
                    z6 z6Var = new z6(this, context, c7Var, i11);
                    c7Var.N = z6Var;
                    z6Var.setDelegate(new g(this, 7));
                    c7Var.N.setCacheModel(c7Var.Y);
                    c7Var.V.a0(c7Var.N, AndroidUtilities.dp(40.0f));
                    z6Var.setLayoutParams(new s4.o0(-1, -1));
                    frameLayout = z6Var;
                    break;
                case 9:
                    y6 y6Var = new y6(this, context);
                    c7Var.Q = y6Var;
                    y6Var.setTag(-33024);
                    frameLayout2 = y6Var;
                    frameLayout = frameLayout2;
                    break;
                case 10:
                    n6 n6Var = new n6(c7Var, context);
                    c7Var.R = n6Var;
                    n6Var.setTag(-33024);
                    frameLayout2 = n6Var;
                    frameLayout = frameLayout2;
                    break;
                case 11:
                    frameLayout2 = new org.telegram.ui.Cells.a2(4, 21, this.d, c7Var.getResourceProvider(), false);
                    frameLayout = frameLayout2;
                    break;
                case 12:
                    org.telegram.ui.Components.b10 b10Var2 = new org.telegram.ui.Components.b10(c7Var.getParentActivity(), null);
                    b10Var2.setIsSingleCell(true);
                    b10Var2.setItemsCount(1);
                    b10Var2.setIgnoreHeightCheck(true);
                    b10Var2.setViewType(26);
                    frameLayout = b10Var2;
                    break;
                case 13:
                    s6 s6Var = new s6(c7Var, context);
                    c7Var.S = s6Var;
                    frameLayout = s6Var;
                    break;
                case 14:
                    org.telegram.ui.Components.nw0 nw0Var2 = new org.telegram.ui.Components.nw0(context, null);
                    float f7 = ((int) ((c7Var.I / 1024) / 1024)) / 1000.0f;
                    ArrayList arrayList = new ArrayList();
                    if (f7 <= 17.0f) {
                        arrayList.add(2);
                    }
                    if (f7 > 5.0f) {
                        arrayList.add(5);
                    }
                    if (f7 > 16.0f) {
                        arrayList.add(16);
                    }
                    if (f7 > 32.0f) {
                        arrayList.add(32);
                    }
                    arrayList.add(Integer.valueOf(ConnectionsManager.DEFAULT_DATACENTER_ID));
                    String[] strArr = new String[arrayList.size()];
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        if (((Integer) arrayList.get(i14)).intValue() == 1) {
                            strArr[i14] = "300 MB";
                        } else if (((Integer) arrayList.get(i14)).intValue() == Integer.MAX_VALUE) {
                            strArr[i14] = LocaleController.getString(R.string.NoLimit);
                        } else {
                            strArr[i14] = String.format("%d GB", arrayList.get(i14));
                        }
                    }
                    nw0Var2.setCallback(new b1(arrayList, 9));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    nw0Var2.b(indexOf2, null, strArr);
                    frameLayout = nw0Var2;
                    break;
                default:
                    frameLayout = new org.telegram.ui.Cells.d9(context);
                    break;
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.ba(context);
        }
        return new org.telegram.ui.Components.sl0(frameLayout);
    }
}
