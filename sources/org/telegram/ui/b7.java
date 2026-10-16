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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class b7 extends pg.b {
    public final Context d;
    public final /* synthetic */ d7 e;

    public b7(d7 d7Var, Context context) {
        this.e = d7Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        long b10 = b1Var.b();
        d7 d7Var = this.e;
        if (b10 == d7Var.K) {
            return true;
        }
        int i10 = b1Var.f;
        return (i10 == 2 && d7Var.H > 0 && !d7Var.L) || i10 == 5 || i10 == 7 || i10 == 11;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.a0.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((y6) this.e.a0.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        d7 d7Var = this.e;
        ArrayList arrayList = d7Var.a0;
        y6 y6Var = (y6) arrayList.get(i10);
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
            if (i10 == d7Var.K) {
                caVar.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
                return;
            }
            return;
        }
        if (i12 == 1) {
            ((org.telegram.ui.Cells.e9) view).setText(AndroidUtilities.replaceTags(y6Var.e));
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                m4Var.setText(((y6) arrayList.get(i10)).d);
                ((y6) arrayList.get(i10)).getClass();
                m4Var.setTopMargin(15);
                ((y6) arrayList.get(i10)).getClass();
                m4Var.setBottomMargin(0);
                return;
            }
            int i13 = 7;
            if (i12 == 7) {
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                CacheByChatsController cacheByChatsController = d7Var.getMessagesController().getCacheByChatsController();
                int i14 = y6Var.c;
                int size = cacheByChatsController.getKeepMediaExceptions(((y6) arrayList.get(i10)).c).size();
                String formatPluralString = size > 0 ? LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size)) : null;
                String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i14));
                if (((y6) arrayList.get(i10)).c == 0) {
                    r8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                } else if (((y6) arrayList.get(i10)).c == 1) {
                    r8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                } else if (((y6) arrayList.get(i10)).c == 2) {
                    r8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                } else if (((y6) arrayList.get(i10)).c == 3) {
                    r8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                }
                r8Var.setSubtitle(formatPluralString);
                return;
            }
            switch (i12) {
                case 9:
                    d7Var.v0();
                    break;
                case 10:
                    n6 n6Var = d7Var.R;
                    if (n6Var != null && !d7Var.L) {
                        long j10 = d7Var.H;
                        boolean z10 = j10 > 0;
                        long j11 = d7Var.I;
                        n6Var.b(j11 <= 0 ? 0.0f : j10 / j11, (d7Var.J <= 0 || j11 <= 0) ? 0.0f : (j11 - r9) / j11, z10);
                        break;
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                    int i15 = y6Var.f;
                    boolean r02 = i15 < 0 ? d7Var.r0() : d7Var.e[i15];
                    CharSequence charSequence = y6Var.d;
                    int[] iArr = d7Var.O;
                    int i16 = y6Var.f;
                    if (i16 < 0) {
                        i16 = 9;
                    }
                    int i17 = iArr[i16];
                    SpannableString spannableString = new SpannableString(i17 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i17)));
                    spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.j61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    spannableStringBuilder.append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) spannableString);
                    a2Var.e(spannableStringBuilder, AndroidUtilities.formatFileSize(y6Var.g), r02, y6Var.f >= 0 ? !y6Var.j : !d7Var.M, false);
                    int i18 = y6Var.h;
                    int i19 = org.telegram.ui.ActionBar.g6.k7;
                    org.telegram.ui.Components.aq aqVar = a2Var.r;
                    if (aqVar != null) {
                        aqVar.b(i18, i18, i19);
                    }
                    a2Var.setCollapsed(y6Var.f < 0 ? Boolean.valueOf(d7Var.M) : null);
                    if (y6Var.f == -1) {
                        a2Var.d(new a(this, i13), new bi.u1(25, this, a2Var));
                    } else {
                        a2Var.d(null, null);
                    }
                    a2Var.setPad(y6Var.i ? 1 : 0);
                    break;
            }
            return;
        }
        final org.telegram.ui.Components.dz0 dz0Var = (org.telegram.ui.Components.dz0) view;
        boolean z11 = d7Var.L;
        long j12 = d7Var.f;
        long j13 = d7Var.H;
        long j14 = d7Var.J;
        long j15 = d7Var.I;
        c2.b bVar = dz0Var.I;
        View view2 = dz0Var.w;
        TextView textView = dz0Var.n;
        TextView textView2 = dz0Var.h;
        TextView textView3 = dz0Var.v;
        org.telegram.ui.Cells.ca caVar2 = dz0Var.y;
        dz0Var.e = z11;
        TextView textView4 = dz0Var.r;
        textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j14)));
        TextView textView5 = dz0Var.s;
        long j16 = j15 - j14;
        textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j16)));
        if (z11) {
            textView3.setVisibility(0);
            textView2.setVisibility(8);
            textView4.setVisibility(8);
            textView5.setVisibility(8);
            textView.setVisibility(8);
            view2.setVisibility(8);
            caVar2.setVisibility(8);
            dz0Var.E = 0.0f;
            dz0Var.F = 0.0f;
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
                caVar2.setVisibility(0);
                textView2.setVisibility(0);
                textView.setVisibility(8);
                caVar2.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j13), false, true);
                textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j13 + j12)));
            } else {
                i11 = 0;
                textView2.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j12)));
                view2.setVisibility(8);
                caVar2.setVisibility(8);
            }
            textView4.setVisibility(i11);
            textView5.setVisibility(i11);
            float f7 = j15;
            float f10 = (j13 + j12) / f7;
            float f11 = j16 / f7;
            if (dz0Var.E != f10) {
                ValueAnimator valueAnimator = dz0Var.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                final int i20 = 0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(dz0Var.E, f10);
                dz0Var.G = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.cz0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i20) {
                            case 0:
                                dz0 dz0Var2 = dz0Var;
                                dz0Var2.getClass();
                                dz0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                dz0Var2.invalidate();
                                break;
                            default:
                                dz0 dz0Var3 = dz0Var;
                                dz0Var3.getClass();
                                dz0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                dz0Var3.invalidate();
                                break;
                        }
                    }
                });
                dz0Var.G.start();
            }
            if (dz0Var.F != f11) {
                ValueAnimator valueAnimator2 = dz0Var.H;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                final int i21 = 1;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(dz0Var.F, f11);
                dz0Var.H = ofFloat2;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.cz0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        switch (i21) {
                            case 0:
                                dz0 dz0Var2 = dz0Var;
                                dz0Var2.getClass();
                                dz0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                dz0Var2.invalidate();
                                break;
                            default:
                                dz0 dz0Var3 = dz0Var;
                                dz0Var3.getClass();
                                dz0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                dz0Var3.invalidate();
                                break;
                        }
                    }
                });
                dz0Var.H.start();
            }
        }
        caVar2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        dz0Var.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        n6 n6Var;
        Context context = this.d;
        if (i10 != 0) {
            int i11 = 16;
            int i12 = 0;
            d7 d7Var = this.e;
            switch (i10) {
                case 2:
                    org.telegram.ui.Components.dz0 dz0Var = new org.telegram.ui.Components.dz0(context);
                    Paint paint = new Paint(1);
                    dz0Var.a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    dz0Var.b = paint3;
                    Paint paint4 = new Paint(1);
                    dz0Var.c = paint4;
                    dz0Var.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    dz0Var.L = hVar;
                    dz0Var.setWillNotDraw(false);
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
                    di.ab abVar = new di.ab(dz0Var, context, 26);
                    dz0Var.f = abVar;
                    dz0Var.addView(abVar, w7.z5.d(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    dz0Var.addView(linearLayout, w7.z5.d(-2.0f, -1));
                    bi.i5 i5Var = new bi.i5(context, 20);
                    linearLayout.addView(i5Var, w7.z5.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    dz0Var.v = textView;
                    int i13 = org.telegram.ui.ActionBar.g6.y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        c2.b bVar = new c2.b(textView);
                        dz0Var.I = bVar;
                        bVar.A(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    dz0Var.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
                    TextView textView3 = new TextView(context);
                    dz0Var.n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
                    TextView textView4 = new TextView(context);
                    dz0Var.r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
                    TextView textView5 = new TextView(context);
                    dz0Var.s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
                    dz0Var.x = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), dz0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), i0.a.k(dz0Var.x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), i0.a.k(dz0Var.x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), dz0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    i5Var.addView(textView, w7.z5.d(-2.0f, -2));
                    i5Var.addView(textView3, w7.z5.d(-2.0f, -2));
                    i5Var.addView(textView2, w7.z5.d(-2.0f, -2));
                    i5Var.addView(textView5, w7.z5.d(-2.0f, -2));
                    i5Var.addView(textView4, w7.z5.d(-2.0f, -2));
                    View view = new View(dz0Var.getContext());
                    dz0Var.w = view;
                    linearLayout.addView(view, w7.z5.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d7, false));
                    org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(dz0Var.getContext());
                    dz0Var.y = caVar;
                    linearLayout.addView(caVar, w7.z5.n(-1, -2));
                    frameLayout = dz0Var;
                    break;
                case 3:
                    frameLayout = new org.telegram.ui.Cells.m4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.sw0 sw0Var = new org.telegram.ui.Components.sw0(context, null);
                    sw0Var.setCallback(new m4.v0(i11));
                    int i14 = SharedConfig.keepMedia;
                    sw0Var.b(i14 == 3 ? 0 : i14 + 1, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    frameLayout = sw0Var;
                    break;
                case 5:
                    frameLayout = new c7(d7Var.getParentActivity(), d7Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(d7Var.getParentActivity(), null);
                    f10Var.setIsSingleCell(true);
                    f10Var.setItemsCount(3);
                    f10Var.setIgnoreHeightCheck(true);
                    f10Var.setViewType(25);
                    frameLayout = f10Var;
                    break;
                case 7:
                    frameLayout = new org.telegram.ui.Cells.r8(context);
                    break;
                case 8:
                    a7 a7Var = new a7(this, context, d7Var, i12);
                    d7Var.N = a7Var;
                    a7Var.setDelegate(new g(this, 7));
                    d7Var.N.setCacheModel(d7Var.Y);
                    d7Var.V.a0(d7Var.N, AndroidUtilities.dp(40.0f));
                    a7Var.setLayoutParams(new s4.o0(-1, -1));
                    frameLayout = a7Var;
                    break;
                case 9:
                    z6 z6Var = new z6(this, context);
                    d7Var.Q = z6Var;
                    z6Var.setTag(-33024);
                    n6Var = z6Var;
                    frameLayout = n6Var;
                    break;
                case 10:
                    n6 n6Var2 = new n6(d7Var, context);
                    d7Var.R = n6Var2;
                    n6Var2.setTag(-33024);
                    n6Var = n6Var2;
                    frameLayout = n6Var;
                    break;
                case 11:
                    frameLayout = new org.telegram.ui.Cells.a2(4, 21, this.d, d7Var.getResourceProvider(), false);
                    break;
                case 12:
                    org.telegram.ui.Components.f10 f10Var2 = new org.telegram.ui.Components.f10(d7Var.getParentActivity(), null);
                    f10Var2.setIsSingleCell(true);
                    f10Var2.setItemsCount(1);
                    f10Var2.setIgnoreHeightCheck(true);
                    f10Var2.setViewType(26);
                    frameLayout = f10Var2;
                    break;
                case 13:
                    t6 t6Var = new t6(d7Var, context);
                    d7Var.S = t6Var;
                    frameLayout = t6Var;
                    break;
                case 14:
                    org.telegram.ui.Components.sw0 sw0Var2 = new org.telegram.ui.Components.sw0(context, null);
                    float f7 = ((int) ((d7Var.I / 1024) / 1024)) / 1000.0f;
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
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        if (((Integer) arrayList.get(i15)).intValue() == 1) {
                            strArr[i15] = "300 MB";
                        } else if (((Integer) arrayList.get(i15)).intValue() == Integer.MAX_VALUE) {
                            strArr[i15] = LocaleController.getString(R.string.NoLimit);
                        } else {
                            strArr[i15] = String.format("%d GB", arrayList.get(i15));
                        }
                    }
                    sw0Var2.setCallback(new b1(arrayList, 9));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    sw0Var2.b(indexOf2, null, strArr);
                    frameLayout = sw0Var2;
                    break;
                default:
                    frameLayout = new org.telegram.ui.Cells.e9(context);
                    break;
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.ca(context);
        }
        return new org.telegram.ui.Components.wl0(frameLayout);
    }
}
