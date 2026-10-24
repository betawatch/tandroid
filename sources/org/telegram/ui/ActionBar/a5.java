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
import org.telegram.messenger.sl;
import org.telegram.ui.Components.zt;
import org.telegram.ui.va1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class a5 {
    public static final m4 p = new m4();
    public static final List q = Arrays.asList(Integer.valueOf(R.id.menu_regular), Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_quote), Integer.valueOf(R.id.menu_date));
    public static final List r = Arrays.asList(Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_quote));
    public final View a;
    public final y4 b;
    public Menu e;
    public final int i;
    public Runnable j;
    public zt k;
    public final g6 n;
    public final bh.b o;
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f = new ArrayList();
    public MenuItem.OnMenuItemClickListener g = p;
    public boolean h = true;
    public final n4 l = new n4(this);
    public final l4 m = new l4(0);

    public a5(Context context, View view, int i10, g6 g6Var, bh.b bVar) {
        this.a = view;
        this.i = i10;
        this.o = bVar;
        this.n = g6Var;
        this.b = new y4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i10, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i10);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011f  */
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
    public static LinearLayout b(a5 a5Var, Context context, MenuItem menuItem, boolean z10, boolean z11, boolean z12) {
        int w02;
        int i10;
        int i11;
        int i12 = a5Var.i;
        g6 g6Var = a5Var.n;
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
        int w03 = k6.w0(k6.i6, g6Var);
        if (i12 == 0) {
            i10 = k6.j5;
            w02 = k6.w0(i10, g6Var);
            r6.W(textView, i10, g6Var);
        } else {
            if (i12 == 2) {
                textView.setTextColor(-328966);
                i11 = -328966;
                w03 = 553648127;
                i10 = -1;
                if (!z11 || z12) {
                    linearLayout.setBackground(k6.b0(w03, !z11 ? 12 : 0, !z12 ? 12 : 0, !z12 ? 12 : 0, !z11 ? 12 : 0));
                } else {
                    linearLayout.setBackground(k6.g0(w03, 2, -1));
                }
                textView.setPaddingRelative(AndroidUtilities.dp(11.0f), 0, 0, 0);
                linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, AndroidUtilities.dp(!z10 ? 42.0f : 48.0f)));
                linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.msg_mini_lock3);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                if (i12 == 2) {
                    if (i10 < 0) {
                        i10 = k6.G6;
                    }
                    r6.u(imageView, r6.M(0.4f, i10), g6Var, PorterDuff.Mode.SRC_IN);
                } else {
                    imageView.setColorFilter(new PorterDuffColorFilter(k6.o1(0.4f, i11), PorterDuff.Mode.SRC_IN));
                }
                imageView.setVisibility(8);
                linearLayout.addView(imageView, w7.z5.p(-2, -1, 0.0f, 0, 12, 0, 0, 0));
                if (menuItem != null) {
                    e(linearLayout, menuItem, a5Var.j != null);
                }
                return linearLayout;
            }
            if (i12 == 1) {
                i10 = k6.G6;
                w02 = k6.w0(i10, g6Var);
                r6.W(textView, i10, g6Var);
            } else {
                w02 = k6.w0(k6.G6, g6Var);
                i10 = -1;
            }
        }
        i11 = w02;
        if (z11) {
        }
        linearLayout.setBackground(k6.b0(w03, !z11 ? 12 : 0, !z12 ? 12 : 0, !z12 ? 12 : 0, !z11 ? 12 : 0));
        textView.setPaddingRelative(AndroidUtilities.dp(11.0f), 0, 0, 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, AndroidUtilities.dp(!z10 ? 42.0f : 48.0f)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_mini_lock3);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        if (i12 == 2) {
        }
        imageView2.setVisibility(8);
        linearLayout.addView(imageView2, w7.z5.p(-2, -1, 0.0f, 0, 12, 0, 0, 0));
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
        y4 y4Var = this.b;
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
        boolean z12 = y4Var.F;
        Rect rect = y4Var.A;
        a5 a5Var = y4Var.Q;
        boolean z13 = true;
        if (!z12) {
            y4Var.G = false;
            y4Var.F = true;
            y4Var.x.cancel();
            y4Var.w.start();
            y4Var.D.setEmpty();
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.g;
        Size size2 = y4Var.H;
        y4Var.K = onMenuItemClickListener;
        y4Var.d();
        y4Var.I = null;
        y4Var.J = null;
        y4Var.N = false;
        y4Var.n();
        va1 va1Var = y4Var.g;
        va1Var.removeAllViews();
        va1Var.setPaddingRelative(0, 0, 0, 0);
        x4 x4Var = y4Var.h;
        ArrayAdapter arrayAdapter = (ArrayAdapter) x4Var.getAdapter();
        arrayAdapter.clear();
        x4Var.setAdapter((ListAdapter) arrayAdapter);
        y4Var.f.removeAllViews();
        y4Var.b.getWindowVisibleDisplayFrame(rect);
        int min = Math.min(AndroidUtilities.dp(400.0f), sl.B(16.0f, 2, rect.width()));
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
            if (menuItem3 == null || a5Var.j == null || !list3.contains(Integer.valueOf(menuItem3.getItemId()))) {
                int i13 = i12;
                list = list3;
                LinearLayout b10 = b(a5Var, y4Var.a, menuItem3, false, z14, z15);
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
                b10.setOnClickListener(y4Var.L);
                va1Var.addView(b10);
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
            va1Var.setPaddingRelative(0, 0, size2.getWidth(), 0);
        }
        va1Var.measure(i10, i10);
        y4Var.J = new Size(va1Var.getMeasuredWidth(), va1Var.getMeasuredHeight());
        if (!linkedList.isEmpty()) {
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) x4Var.getAdapter();
            arrayAdapter2.clear();
            if (a5Var.j != null) {
                Collections.sort(linkedList, new l4(1));
            }
            int size3 = linkedList.size();
            boolean premiumFeaturesBlocked = MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked();
            int i15 = 0;
            while (i15 < size3) {
                MenuItem menuItem4 = (MenuItem) linkedList.get(i15);
                if (a5Var.j == null) {
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
            x4Var.setAdapter((ListAdapter) arrayAdapter2);
            if (y4Var.M) {
                x4Var.setY(0.0f);
            } else {
                x4Var.setY(size2.getHeight());
            }
            int count = x4Var.getAdapter().getCount();
            int i16 = 0;
            for (int i17 = 0; i17 < count; i17++) {
                MenuItem menuItem5 = (MenuItem) x4Var.getAdapter().getItem(i17);
                com.google.firebase.messaging.n nVar = y4Var.q;
                LinearLayout linearLayout = (LinearLayout) nVar.d;
                e(linearLayout, menuItem5, ((y4) nVar.e).Q.j != null ? z10 : false);
                linearLayout.measure(0, 0);
                i16 = Math.max(linearLayout.getMeasuredWidth(), i16);
            }
            Size size4 = new Size(Math.max(i16, size2.getWidth()), y4Var.c(4));
            y4Var.I = size4;
            y4.m(x4Var, size4);
        }
        y4Var.p();
        this.f = d;
        boolean f7 = y4Var.f();
        Point point = y4Var.B;
        PopupWindow popupWindow = y4Var.c;
        Rect rect2 = this.d;
        Rect rect3 = this.c;
        if (f7) {
            if (!rect2.equals(rect3) && y4Var.f() && popupWindow.isShowing()) {
                y4Var.d();
                y4Var.i(rect3);
                y4Var.h();
                popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
            }
        } else if (!y4Var.f()) {
            y4Var.G = false;
            y4Var.F = false;
            y4Var.w.cancel();
            y4Var.x.cancel();
            y4Var.d();
            y4Var.i(rect3);
            y4Var.h();
            popupWindow.showAtLocation(y4Var.b, 0, point.x, point.y);
            y4Var.v.start();
        }
        this.h = false;
        rect2.set(rect3);
    }

    public final ArrayList d(Menu menu) {
        zt ztVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; menu != null && i10 < menu.size(); i10++) {
            MenuItem item = menu.getItem(i10);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (ztVar = this.k) == null || ((Boolean) ztVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
