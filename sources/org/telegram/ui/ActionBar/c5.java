package org.telegram.ui.ActionBar;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Property;
import android.util.Size;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c5 {
    public static final o4 p = new o4();
    public static final List q = Arrays.asList(Integer.valueOf(R.id.menu_regular), Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_quote), Integer.valueOf(R.id.menu_date));
    public static final List r = Arrays.asList(Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_quote));
    public final View a;
    public final a5 b;
    public Menu e;
    public final int i;
    public Runnable j;
    public au k;
    public final u6 n;
    public final ch.b o;
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f = new ArrayList();
    public MenuItem.OnMenuItemClickListener g = p;
    public boolean h = true;
    public final p4 l = new p4(this);
    public final n4 m = new n4(0);

    public c5(Context context, View view, int i10, u6 u6Var, ch.b bVar) {
        this.a = view;
        this.i = i10;
        this.o = bVar;
        this.n = u6Var;
        this.b = new a5(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i10, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i10);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinearLayout b(c5 c5Var, Context context, MenuItem menuItem, boolean z10, boolean z11, boolean z12) {
        int w02;
        int i10;
        int i11;
        int i12 = c5Var.i;
        u6 u6Var = c5Var.n;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(AndroidUtilities.dp(48.0f));
        linearLayout.setMinimumHeight(AndroidUtilities.dp(z10 ? 42.0f : 48.0f));
        linearLayout.setPaddingRelative(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setFocusable(false);
        textView.setImportantForAccessibility(2);
        textView.setFocusableInTouchMode(false);
        int w03 = y6.w0(y6.i6, u6Var);
        if (i12 == 0) {
            i10 = y6.j5;
            w02 = y6.w0(i10, u6Var);
            f7.V(textView, i10, u6Var);
        } else {
            if (i12 == 2) {
                textView.setTextColor(-328966);
                i11 = -328966;
                w03 = 553648127;
                i10 = -1;
                if (!z11 || z12) {
                    linearLayout.setBackground(y6.b0(w03, !z11 ? 12 : 0, !z12 ? 12 : 0, !z12 ? 12 : 0, !z11 ? 12 : 0));
                } else {
                    linearLayout.setBackground(y6.g0(w03, 2, -1));
                }
                textView.setPaddingRelative(AndroidUtilities.dp(11.0f), 0, 0, 0);
                linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, AndroidUtilities.dp(!z10 ? 42.0f : 48.0f)));
                linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
                int i13 = i11;
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.msg_mini_lock3);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                if (i12 == 2) {
                    if (i10 < 0) {
                        i10 = y6.G6;
                    }
                    b7 L = f7.L(0.4f, i10);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    int i14 = L.a;
                    float f7 = L.d;
                    int Q = f7.Q(i14, -1, 2, f7, u6Var);
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
                    imageView.setColorFilter(porterDuffColorFilter);
                    f7.O(imageView, 5, i14, -1, 2, f7, u6Var, Q, porterDuffColorFilter).h = mode;
                } else {
                    imageView.setColorFilter(new PorterDuffColorFilter(y6.o1(0.4f, i13), PorterDuff.Mode.SRC_IN));
                }
                imageView.setVisibility(8);
                linearLayout.addView(imageView, kb1.t(-2, -1, 0.0f, 0, 12, 0, 0, 0));
                if (menuItem != null) {
                    e(linearLayout, menuItem, c5Var.j != null);
                }
                return linearLayout;
            }
            if (i12 == 1) {
                i10 = y6.G6;
                w02 = y6.w0(i10, u6Var);
                f7.V(textView, i10, u6Var);
            } else {
                w02 = y6.w0(y6.G6, u6Var);
                i10 = -1;
            }
        }
        i11 = w02;
        if (z11) {
        }
        linearLayout.setBackground(y6.b0(w03, !z11 ? 12 : 0, !z12 ? 12 : 0, !z12 ? 12 : 0, !z11 ? 12 : 0));
        textView.setPaddingRelative(AndroidUtilities.dp(11.0f), 0, 0, 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, AndroidUtilities.dp(!z10 ? 42.0f : 48.0f)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        int i132 = i11;
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_mini_lock3);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        if (i12 == 2) {
        }
        imageView2.setVisibility(8);
        linearLayout.addView(imageView2, kb1.t(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
        }
        return linearLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(View view, MenuItem menuItem, boolean z10) {
        boolean z11;
        ViewGroup viewGroup = (ViewGroup) view;
        TextView textView = (TextView) viewGroup.getChildAt(0);
        textView.setEllipsize(null);
        if (TextUtils.isEmpty(menuItem.getTitle())) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(menuItem.getTitle());
        }
        textView.setPaddingRelative(0, 0, 0, 0);
        if (z10) {
            if (r.contains(Integer.valueOf(menuItem.getItemId()))) {
                z11 = true;
                viewGroup.getChildAt(2).setVisibility(z11 ? 0 : 8);
            }
        }
        z11 = false;
        viewGroup.getChildAt(2).setVisibility(z11 ? 0 : 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r26.h != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        List list;
        boolean z10;
        int i10;
        List list2;
        boolean z11;
        ArrayList d = d(this.e);
        Collections.sort(d, this.m);
        ArrayList arrayList = this.f;
        a5 a5Var = this.b;
        if (arrayList != null && d.size() == this.f.size()) {
            int size = d.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    MenuItem menuItem = (MenuItem) d.get(i11);
                    MenuItem menuItem2 = (MenuItem) this.f.get(i11);
                    if (menuItem.getItemId() != menuItem2.getItemId() || !TextUtils.equals(menuItem.getTitle(), menuItem2.getTitle()) || !Objects.equals(menuItem.getIcon(), menuItem2.getIcon()) || menuItem.getGroupId() != menuItem2.getGroupId()) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        boolean z12 = a5Var.F;
        Rect rect = a5Var.A;
        c5 c5Var = a5Var.Q;
        boolean z13 = true;
        if (!z12) {
            a5Var.G = false;
            a5Var.F = true;
            a5Var.x.cancel();
            a5Var.w.start();
            a5Var.D.setEmpty();
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.g;
        Size size2 = a5Var.H;
        a5Var.K = onMenuItemClickListener;
        a5Var.d();
        a5Var.I = null;
        a5Var.J = null;
        a5Var.N = false;
        a5Var.n();
        za1 za1Var = a5Var.g;
        za1Var.removeAllViews();
        za1Var.setPaddingRelative(0, 0, 0, 0);
        z4 z4Var = a5Var.h;
        ArrayAdapter arrayAdapter = (ArrayAdapter) z4Var.getAdapter();
        arrayAdapter.clear();
        z4Var.setAdapter((ListAdapter) arrayAdapter);
        a5Var.f.removeAllViews();
        a5Var.b.getWindowVisibleDisplayFrame(rect);
        int min = Math.min(AndroidUtilities.dp(400.0f), wh.C(16.0f, 2, rect.width()));
        LinkedList linkedList = new LinkedList(d);
        Iterator it = linkedList.iterator();
        int i12 = min;
        boolean z14 = true;
        while (true) {
            boolean hasNext = it.hasNext();
            List list3 = r;
            if (!hasNext) {
                list = list3;
                z10 = z13;
                break;
            }
            MenuItem menuItem3 = (MenuItem) it.next();
            boolean hasNext2 = it.hasNext();
            boolean z15 = !hasNext2;
            z10 = z13;
            if (menuItem3 == null || c5Var.j == null || !list3.contains(Integer.valueOf(menuItem3.getItemId()))) {
                int i13 = i12;
                list = list3;
                LinearLayout b10 = b(c5Var, a5Var.a, menuItem3, false, z14, z15);
                b10.setGravity(17);
                int i14 = min;
                b10.setPaddingRelative((int) ((z14 ? 1.5d : 1.0d) * b10.getPaddingStart()), b10.getPaddingTop(), (int) (b10.getPaddingEnd() * (hasNext2 ? 1.0d : 1.5d)), b10.getPaddingBottom());
                b10.measure(0, 0);
                min = i14;
                int min2 = Math.min(b10.getMeasuredWidth(), min);
                boolean z16 = min2 <= i13 - size2.getWidth() ? z10 : false;
                boolean z17 = (hasNext2 || min2 > i13) ? false : z10;
                if (!z16 && !z17) {
                    break;
                }
                b10.setTag(menuItem3);
                b10.setOnClickListener(a5Var.L);
                za1Var.addView(b10);
                ViewGroup.LayoutParams layoutParams = b10.getLayoutParams();
                layoutParams.width = min2;
                b10.setLayoutParams(layoutParams);
                i12 = i13 - min2;
                it.remove();
                z13 = z10;
                z14 = false;
            } else {
                z13 = z10;
            }
        }
        if (linkedList.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 0;
            za1Var.setPaddingRelative(0, 0, size2.getWidth(), 0);
        }
        za1Var.measure(i10, i10);
        a5Var.J = new Size(za1Var.getMeasuredWidth(), za1Var.getMeasuredHeight());
        if (!linkedList.isEmpty()) {
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) z4Var.getAdapter();
            arrayAdapter2.clear();
            if (c5Var.j != null) {
                Collections.sort(linkedList, new n4(1));
            }
            int size3 = linkedList.size();
            boolean premiumFeaturesBlocked = MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked();
            int i15 = 0;
            while (i15 < size3) {
                MenuItem menuItem4 = (MenuItem) linkedList.get(i15);
                if (c5Var.j == null) {
                    z11 = z10;
                    list2 = list;
                } else {
                    list2 = list;
                    z11 = list2.contains(Integer.valueOf(menuItem4.getItemId())) ? !premiumFeaturesBlocked : z10;
                }
                if (z11) {
                    arrayAdapter2.add(menuItem4);
                }
                i15++;
                list = list2;
            }
            z4Var.setAdapter((ListAdapter) arrayAdapter2);
            if (a5Var.M) {
                z4Var.setY(0.0f);
            } else {
                z4Var.setY(size2.getHeight());
            }
            int count = z4Var.getAdapter().getCount();
            int i16 = 0;
            for (int i17 = 0; i17 < count; i17++) {
                MenuItem menuItem5 = (MenuItem) z4Var.getAdapter().getItem(i17);
                com.google.firebase.messaging.m mVar = a5Var.q;
                LinearLayout linearLayout = (LinearLayout) mVar.d;
                e(linearLayout, menuItem5, ((a5) mVar.e).Q.j != null ? z10 : false);
                linearLayout.measure(0, 0);
                i16 = Math.max(linearLayout.getMeasuredWidth(), i16);
            }
            Size size4 = new Size(Math.max(i16, size2.getWidth()), a5Var.c(4));
            a5Var.I = size4;
            a5.m(z4Var, size4);
        }
        a5Var.p();
        this.f = d;
        boolean f7 = a5Var.f();
        Point point = a5Var.B;
        PopupWindow popupWindow = a5Var.c;
        Rect rect2 = this.d;
        Rect rect3 = this.c;
        if (f7) {
            if (!rect2.equals(rect3) && a5Var.f() && popupWindow.isShowing()) {
                a5Var.d();
                a5Var.i(rect3);
                a5Var.h();
                popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
            }
        } else if (!a5Var.f()) {
            a5Var.G = false;
            a5Var.F = false;
            a5Var.w.cancel();
            a5Var.x.cancel();
            a5Var.d();
            a5Var.i(rect3);
            a5Var.h();
            popupWindow.showAtLocation(a5Var.b, 0, point.x, point.y);
            a5Var.v.start();
        }
        this.h = false;
        rect2.set(rect3);
    }

    public final ArrayList d(Menu menu) {
        au auVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; menu != null && i10 < menu.size(); i10++) {
            MenuItem item = menu.getItem(i10);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (auVar = this.k) == null || ((Boolean) auVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
