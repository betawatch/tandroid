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
import org.telegram.ui.Components.ot;
import org.telegram.ui.ob1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class z4 {
    public static final l4 p = new l4();
    public static final List q = Arrays.asList(Integer.valueOf(R.id.menu_regular), Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_quote), Integer.valueOf(R.id.menu_date));
    public static final List r = Arrays.asList(Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_quote));
    public final View a;
    public final x4 b;
    public Menu e;
    public final int i;
    public Runnable j;
    public ot k;
    public final g6 n;
    public final og.a o;
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f = new ArrayList();
    public MenuItem.OnMenuItemClickListener g = p;
    public boolean h = true;
    public final m4 l = new m4(this);
    public final oh.k0 m = new oh.k0(4);

    public z4(Context context, View view, int i10, g6 g6Var, og.a aVar) {
        this.a = view;
        this.i = i10;
        this.o = aVar;
        this.n = g6Var;
        this.b = new x4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i10, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i10);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static LinearLayout b(z4 z4Var, Context context, MenuItem menuItem, boolean z4, boolean z10, boolean z11) {
        int v02;
        g6 g6Var = z4Var.n;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(AndroidUtilities.dp(48.0f));
        linearLayout.setMinimumHeight(AndroidUtilities.dp(z4 ? 42.0f : 48.0f));
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
        int v03 = k6.v0(k6.i6, g6Var);
        int i10 = z4Var.i;
        if (i10 == 0) {
            v02 = k6.v0(k6.j5, g6Var);
            textView.setTextColor(v02);
        } else if (i10 == 2) {
            v02 = -328966;
            textView.setTextColor(-328966);
            v03 = 553648127;
        } else if (i10 == 1) {
            v02 = k6.v0(k6.G6, g6Var);
            textView.setTextColor(v02);
        } else {
            v02 = k6.v0(k6.G6, g6Var);
        }
        if (z10 || z11) {
            linearLayout.setBackground(k6.a0(v03, z10 ? 12 : 0, z11 ? 12 : 0, z11 ? 12 : 0, z10 ? 12 : 0));
        } else {
            linearLayout.setBackground(k6.f0(v03, 2, -1));
        }
        textView.setPaddingRelative(AndroidUtilities.dp(11.0f), 0, 0, 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, AndroidUtilities.dp(z4 ? 42.0f : 48.0f)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_mini_lock3);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(k6.l1(0.4f, v02), PorterDuff.Mode.SRC_IN));
        imageView.setVisibility(8);
        linearLayout.addView(imageView, k7.c6.p(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
            e(linearLayout, menuItem, z4Var.j != null);
        }
        return linearLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(View view, MenuItem menuItem, boolean z4) {
        boolean z10;
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
        if (z4) {
            if (r.contains(Integer.valueOf(menuItem.getItemId()))) {
                z10 = true;
                viewGroup.getChildAt(2).setVisibility(z10 ? 0 : 8);
            }
        }
        z10 = false;
        viewGroup.getChildAt(2).setVisibility(z10 ? 0 : 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r26.h != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        List list;
        int i10;
        List list2;
        boolean z4;
        ArrayList d = d(this.e);
        Collections.sort(d, this.m);
        ArrayList arrayList = this.f;
        x4 x4Var = this.b;
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
        boolean z10 = x4Var.F;
        Rect rect = x4Var.A;
        z4 z4Var = x4Var.Q;
        if (!z10) {
            x4Var.G = false;
            x4Var.F = true;
            x4Var.x.cancel();
            x4Var.w.start();
            x4Var.D.setEmpty();
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.g;
        Size size2 = x4Var.H;
        x4Var.K = onMenuItemClickListener;
        x4Var.d();
        x4Var.I = null;
        x4Var.J = null;
        x4Var.N = false;
        x4Var.n();
        ob1 ob1Var = x4Var.g;
        ob1Var.removeAllViews();
        ob1Var.setPaddingRelative(0, 0, 0, 0);
        w4 w4Var = x4Var.h;
        ArrayAdapter arrayAdapter = (ArrayAdapter) w4Var.getAdapter();
        arrayAdapter.clear();
        w4Var.setAdapter((ListAdapter) arrayAdapter);
        x4Var.f.removeAllViews();
        x4Var.b.getWindowVisibleDisplayFrame(rect);
        int min = Math.min(AndroidUtilities.dp(400.0f), org.telegram.ui.b.z(16.0f, 2, rect.width()));
        LinkedList linkedList = new LinkedList(d);
        Iterator it = linkedList.iterator();
        int i12 = min;
        boolean z11 = true;
        while (true) {
            boolean hasNext = it.hasNext();
            List list3 = r;
            if (!hasNext) {
                list = list3;
                break;
            }
            MenuItem menuItem3 = (MenuItem) it.next();
            boolean hasNext2 = it.hasNext();
            boolean z12 = !hasNext2;
            if (menuItem3 == null || z4Var.j == null || !list3.contains(Integer.valueOf(menuItem3.getItemId()))) {
                int i13 = i12;
                list = list3;
                LinearLayout b10 = b(z4Var, x4Var.a, menuItem3, false, z11, z12);
                b10.setGravity(17);
                int i14 = min;
                b10.setPaddingRelative((int) ((z11 ? 1.5d : 1.0d) * b10.getPaddingStart()), b10.getPaddingTop(), (int) (b10.getPaddingEnd() * (hasNext2 ? 1.0d : 1.5d)), b10.getPaddingBottom());
                b10.measure(0, 0);
                min = i14;
                int min2 = Math.min(b10.getMeasuredWidth(), min);
                boolean z13 = min2 <= i13 - size2.getWidth();
                boolean z14 = !hasNext2 && min2 <= i13;
                if (!z13 && !z14) {
                    break;
                }
                b10.setTag(menuItem3);
                b10.setOnClickListener(x4Var.L);
                ob1Var.addView(b10);
                ViewGroup.LayoutParams layoutParams = b10.getLayoutParams();
                layoutParams.width = min2;
                b10.setLayoutParams(layoutParams);
                i12 = i13 - min2;
                it.remove();
                z11 = false;
            }
        }
        if (linkedList.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 0;
            ob1Var.setPaddingRelative(0, 0, size2.getWidth(), 0);
        }
        ob1Var.measure(i10, i10);
        x4Var.J = new Size(ob1Var.getMeasuredWidth(), ob1Var.getMeasuredHeight());
        if (!linkedList.isEmpty()) {
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) w4Var.getAdapter();
            arrayAdapter2.clear();
            if (z4Var.j != null) {
                Collections.sort(linkedList, new oh.k0(5));
            }
            int size3 = linkedList.size();
            boolean premiumFeaturesBlocked = MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked();
            int i15 = 0;
            while (i15 < size3) {
                MenuItem menuItem4 = (MenuItem) linkedList.get(i15);
                if (z4Var.j == null) {
                    list2 = list;
                } else {
                    list2 = list;
                    if (list2.contains(Integer.valueOf(menuItem4.getItemId()))) {
                        z4 = !premiumFeaturesBlocked;
                        if (!z4) {
                            arrayAdapter2.add(menuItem4);
                        }
                        i15++;
                        list = list2;
                    }
                }
                z4 = true;
                if (!z4) {
                }
                i15++;
                list = list2;
            }
            w4Var.setAdapter((ListAdapter) arrayAdapter2);
            if (x4Var.M) {
                w4Var.setY(0.0f);
            } else {
                w4Var.setY(size2.getHeight());
            }
            int count = w4Var.getAdapter().getCount();
            int i16 = 0;
            for (int i17 = 0; i17 < count; i17++) {
                MenuItem menuItem5 = (MenuItem) w4Var.getAdapter().getItem(i17);
                com.google.firebase.messaging.n nVar = x4Var.q;
                LinearLayout linearLayout = (LinearLayout) nVar.d;
                e(linearLayout, menuItem5, ((x4) nVar.e).Q.j != null);
                linearLayout.measure(0, 0);
                i16 = Math.max(linearLayout.getMeasuredWidth(), i16);
            }
            Size size4 = new Size(Math.max(i16, size2.getWidth()), x4Var.c(4));
            x4Var.I = size4;
            x4.m(w4Var, size4);
        }
        x4Var.p();
        this.f = d;
        boolean f10 = x4Var.f();
        Point point = x4Var.B;
        PopupWindow popupWindow = x4Var.c;
        Rect rect2 = this.d;
        Rect rect3 = this.c;
        if (f10) {
            if (!rect2.equals(rect3) && x4Var.f() && popupWindow.isShowing()) {
                x4Var.d();
                x4Var.i(rect3);
                x4Var.h();
                popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
            }
        } else if (!x4Var.f()) {
            x4Var.G = false;
            x4Var.F = false;
            x4Var.w.cancel();
            x4Var.x.cancel();
            x4Var.d();
            x4Var.i(rect3);
            x4Var.h();
            popupWindow.showAtLocation(x4Var.b, 0, point.x, point.y);
            x4Var.v.start();
        }
        this.h = false;
        rect2.set(rect3);
    }

    public final ArrayList d(Menu menu) {
        ot otVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; menu != null && i10 < menu.size(); i10++) {
            MenuItem item = menu.getItem(i10);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (otVar = this.k) == null || ((Boolean) otVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
