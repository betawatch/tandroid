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
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a7 extends qg.b {
    public final Context d;
    public final /* synthetic */ c7 e;

    public a7(c7 c7Var, Context context) {
        this.e = c7Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        long b10 = e1Var.b();
        c7 c7Var = this.e;
        if (b10 == c7Var.J) {
            return true;
        }
        int i10 = e1Var.f;
        return (i10 == 2 && c7Var.G > 0 && !c7Var.K) || i10 == 5 || i10 == 7 || i10 == 11;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.g0.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((y6) this.e.g0.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        c7 c7Var = this.e;
        ArrayList arrayList = c7Var.g0;
        y6 y6Var = (y6) arrayList.get(i10);
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
            if (i10 == c7Var.J) {
                gaVar.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
                return;
            }
            return;
        }
        if (i12 == 1) {
            ((org.telegram.ui.Cells.i9) view).setText(AndroidUtilities.replaceTags(y6Var.e));
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                q4Var.setText(((y6) arrayList.get(i10)).d);
                ((y6) arrayList.get(i10)).getClass();
                q4Var.setTopMargin(15);
                ((y6) arrayList.get(i10)).getClass();
                q4Var.setBottomMargin(0);
                return;
            }
            if (i12 == 7) {
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                CacheByChatsController cacheByChatsController = c7Var.getMessagesController().getCacheByChatsController();
                int i13 = y6Var.c;
                int size = cacheByChatsController.getKeepMediaExceptions(((y6) arrayList.get(i10)).c).size();
                String formatPluralString = size > 0 ? LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size)) : null;
                String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i13));
                if (((y6) arrayList.get(i10)).c == 0) {
                    v8Var.r(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                } else if (((y6) arrayList.get(i10)).c == 1) {
                    v8Var.r(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                } else if (((y6) arrayList.get(i10)).c == 2) {
                    v8Var.r(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                } else if (((y6) arrayList.get(i10)).c == 3) {
                    v8Var.r(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                }
                v8Var.setSubtitle(formatPluralString);
                return;
            }
            switch (i12) {
                case 9:
                    c7Var.u0();
                    break;
                case 10:
                    o6 o6Var = c7Var.X;
                    if (o6Var != null && !c7Var.K) {
                        long j10 = c7Var.G;
                        boolean z10 = j10 > 0;
                        long j11 = c7Var.H;
                        o6Var.b(j11 <= 0 ? 0.0f : j10 / j11, (c7Var.I <= 0 || j11 <= 0) ? 0.0f : (j11 - r9) / j11, z10);
                        break;
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                    int i14 = y6Var.f;
                    boolean p02 = i14 < 0 ? c7Var.p0() : c7Var.d[i14];
                    CharSequence charSequence = y6Var.d;
                    int[] iArr = c7Var.U;
                    int i15 = y6Var.f;
                    if (i15 < 0) {
                        i15 = 9;
                    }
                    int i16 = iArr[i15];
                    SpannableString spannableString = new SpannableString(i16 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i16)));
                    spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.q61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    spannableStringBuilder.append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) spannableString);
                    y1Var.e(spannableStringBuilder, AndroidUtilities.formatFileSize(y6Var.g), p02, y6Var.f >= 0 ? !y6Var.j : !c7Var.L, false);
                    int i17 = y6Var.h;
                    int i18 = org.telegram.ui.ActionBar.y6.k7;
                    org.telegram.ui.Components.zp zpVar = y1Var.r;
                    if (zpVar != null) {
                        zpVar.b(i17, i17, i18);
                    }
                    y1Var.setCollapsed(y6Var.f < 0 ? Boolean.valueOf(c7Var.L) : null);
                    if (y6Var.f == -1) {
                        y1Var.d(new a(this, 6), new org.telegram.ui.ActionBar.u1(5, this, y1Var));
                    } else {
                        y1Var.d(null, null);
                    }
                    y1Var.setPad(y6Var.i ? 1 : 0);
                    break;
            }
            return;
        }
        final org.telegram.ui.Components.lz0 lz0Var = (org.telegram.ui.Components.lz0) view;
        boolean z11 = c7Var.K;
        long j12 = c7Var.e;
        long j13 = c7Var.G;
        long j14 = c7Var.I;
        long j15 = c7Var.H;
        c2.b bVar = lz0Var.I;
        View view2 = lz0Var.w;
        TextView textView = lz0Var.n;
        TextView textView2 = lz0Var.h;
        TextView textView3 = lz0Var.v;
        org.telegram.ui.Cells.ga gaVar2 = lz0Var.y;
        lz0Var.e = z11;
        TextView textView4 = lz0Var.r;
        textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j14)));
        TextView textView5 = lz0Var.s;
        long j16 = j15 - j14;
        textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j16)));
        if (z11) {
            textView3.setVisibility(0);
            textView2.setVisibility(8);
            textView4.setVisibility(8);
            textView5.setVisibility(8);
            textView.setVisibility(8);
            view2.setVisibility(8);
            gaVar2.setVisibility(8);
            lz0Var.E = 0.0f;
            lz0Var.F = 0.0f;
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
                gaVar2.setVisibility(0);
                textView2.setVisibility(0);
                textView.setVisibility(8);
                gaVar2.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j13), false, true);
                textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j13 + j12)));
            } else {
                i11 = 0;
                textView2.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j12)));
                view2.setVisibility(8);
                gaVar2.setVisibility(8);
            }
            textView4.setVisibility(i11);
            textView5.setVisibility(i11);
            float f7 = j15;
            float f10 = (j13 + j12) / f7;
            float f11 = j16 / f7;
            if (lz0Var.E != f10) {
                ValueAnimator valueAnimator = lz0Var.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                final int i19 = 0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(lz0Var.E, f10);
                lz0Var.G = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.kz0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i19) {
                            case 0:
                                lz0 lz0Var2 = lz0Var;
                                lz0Var2.getClass();
                                lz0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                lz0Var2.invalidate();
                                break;
                            default:
                                lz0 lz0Var3 = lz0Var;
                                lz0Var3.getClass();
                                lz0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                lz0Var3.invalidate();
                                break;
                        }
                    }
                });
                lz0Var.G.start();
            }
            if (lz0Var.F != f11) {
                ValueAnimator valueAnimator2 = lz0Var.H;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                final int i20 = 1;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(lz0Var.F, f11);
                lz0Var.H = ofFloat2;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.kz0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        switch (i20) {
                            case 0:
                                lz0 lz0Var2 = lz0Var;
                                lz0Var2.getClass();
                                lz0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                lz0Var2.invalidate();
                                break;
                            default:
                                lz0 lz0Var3 = lz0Var;
                                lz0Var3.getClass();
                                lz0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                lz0Var3.invalidate();
                                break;
                        }
                    }
                });
                lz0Var.H.start();
            }
        }
        org.telegram.ui.ActionBar.f7.V(gaVar2.getTextView(), org.telegram.ui.ActionBar.y6.G6, null);
        lz0Var.requestLayout();
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        Context context = this.d;
        if (i10 != 0) {
            c7 c7Var = this.e;
            switch (i10) {
                case 2:
                    org.telegram.ui.Components.lz0 lz0Var = new org.telegram.ui.Components.lz0(context);
                    Paint paint = new Paint(1);
                    lz0Var.a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    lz0Var.b = paint3;
                    Paint paint4 = new Paint(1);
                    lz0Var.c = paint4;
                    lz0Var.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    lz0Var.L = hVar;
                    lz0Var.setWillNotDraw(false);
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
                    bi.cc ccVar = new bi.cc(lz0Var, context, 27);
                    lz0Var.f = ccVar;
                    lz0Var.addView(ccVar, org.telegram.ui.Components.gb1.g(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    lz0Var.addView(linearLayout, org.telegram.ui.Components.gb1.g(-2.0f, -1));
                    di.i4 i4Var = new di.i4(context, 19);
                    linearLayout.addView(i4Var, org.telegram.ui.Components.gb1.o(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    lz0Var.v = textView;
                    int i11 = org.telegram.ui.ActionBar.y6.y6;
                    org.telegram.ui.ActionBar.f7.V(textView, i11, null);
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        c2.b bVar = new c2.b(textView);
                        lz0Var.I = bVar;
                        bVar.A(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    lz0Var.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    org.telegram.ui.ActionBar.f7.V(textView2, i11, null);
                    TextView textView3 = new TextView(context);
                    lz0Var.n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    org.telegram.ui.ActionBar.f7.V(textView3, i11, null);
                    TextView textView4 = new TextView(context);
                    lz0Var.r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    org.telegram.ui.ActionBar.f7.V(textView4, i11, null);
                    TextView textView5 = new TextView(context);
                    lz0Var.s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    org.telegram.ui.ActionBar.f7.V(textView5, i11, null);
                    lz0Var.x = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(10.0f), lz0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(10.0f), i0.a.o(lz0Var.x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(10.0f), i0.a.o(lz0Var.x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(10.0f), lz0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    i4Var.addView(textView, org.telegram.ui.Components.gb1.g(-2.0f, -2));
                    i4Var.addView(textView3, org.telegram.ui.Components.gb1.g(-2.0f, -2));
                    i4Var.addView(textView2, org.telegram.ui.Components.gb1.g(-2.0f, -2));
                    i4Var.addView(textView5, org.telegram.ui.Components.gb1.g(-2.0f, -2));
                    i4Var.addView(textView4, org.telegram.ui.Components.gb1.g(-2.0f, -2));
                    View view3 = new View(lz0Var.getContext());
                    lz0Var.w = view3;
                    linearLayout.addView(view3, org.telegram.ui.Components.gb1.x(-1, -2, 0, 21, 0, 0, 0));
                    view3.getLayoutParams().height = 1;
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d7, view3, null);
                    org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(lz0Var.getContext());
                    lz0Var.y = gaVar;
                    linearLayout.addView(gaVar, org.telegram.ui.Components.gb1.r(-1, -2));
                    view = lz0Var;
                    break;
                case 3:
                    view = new org.telegram.ui.Cells.q4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, null);
                    zw0Var.setCallback(new m4.x0(24));
                    int i12 = SharedConfig.keepMedia;
                    zw0Var.b(i12 == 3 ? 0 : i12 + 1, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    view = zw0Var;
                    break;
                case 5:
                    view = new b7(c7Var.getParentActivity(), c7Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(c7Var.getParentActivity(), null);
                    c10Var.setIsSingleCell(true);
                    c10Var.setItemsCount(3);
                    c10Var.setIgnoreHeightCheck(true);
                    c10Var.setViewType(25);
                    view = c10Var;
                    break;
                case 7:
                    view = new org.telegram.ui.Cells.v8(context);
                    break;
                case 8:
                    org.telegram.ui.Components.lw0 lw0Var = c7Var.b0;
                    lw0Var.getClass();
                    View ccVar2 = new bi.cc(lw0Var, context, 24);
                    ccVar2.setTag(-33024);
                    ccVar2.setLayoutParams(new s4.q0(-1, -1));
                    view = ccVar2;
                    break;
                case 9:
                    z6 z6Var = new z6(this, context);
                    c7Var.W = z6Var;
                    z6Var.setTag(-33024);
                    view2 = z6Var;
                    view = view2;
                    break;
                case 10:
                    o6 o6Var = new o6(c7Var, context);
                    c7Var.X = o6Var;
                    o6Var.setTag(-33024);
                    view2 = o6Var;
                    view = view2;
                    break;
                case 11:
                    view2 = new org.telegram.ui.Cells.y1(4, 21, this.d, c7Var.getResourceProvider(), false);
                    view = view2;
                    break;
                case 12:
                    org.telegram.ui.Components.c10 c10Var2 = new org.telegram.ui.Components.c10(c7Var.getParentActivity(), null);
                    c10Var2.setIsSingleCell(true);
                    c10Var2.setItemsCount(1);
                    c10Var2.setIgnoreHeightCheck(true);
                    c10Var2.setViewType(26);
                    view = c10Var2;
                    break;
                case 13:
                    t6 t6Var = new t6(c7Var, context);
                    c7Var.Y = t6Var;
                    view = t6Var;
                    break;
                case 14:
                    org.telegram.ui.Components.zw0 zw0Var2 = new org.telegram.ui.Components.zw0(context, null);
                    float f7 = ((int) ((c7Var.H / 1024) / 1024)) / 1000.0f;
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
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (((Integer) arrayList.get(i13)).intValue() == 1) {
                            strArr[i13] = "300 MB";
                        } else if (((Integer) arrayList.get(i13)).intValue() == Integer.MAX_VALUE) {
                            strArr[i13] = LocaleController.getString(R.string.NoLimit);
                        } else {
                            strArr[i13] = String.format("%d GB", arrayList.get(i13));
                        }
                    }
                    zw0Var2.setCallback(new y0(arrayList, 10));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    zw0Var2.b(indexOf2, null, strArr);
                    view = zw0Var2;
                    break;
                default:
                    view = new org.telegram.ui.Cells.i9(context);
                    break;
            }
        } else {
            view = new org.telegram.ui.Cells.ga(context);
        }
        return new org.telegram.ui.Components.vl0(view);
    }
}
