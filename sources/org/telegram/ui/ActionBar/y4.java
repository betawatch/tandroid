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
import org.telegram.ui.Components.lt;
import org.telegram.ui.pb1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class y4 {
    public static final k4 p = new k4();
    public static final List q = Arrays.asList(Integer.valueOf(R.id.menu_regular), Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_quote), Integer.valueOf(R.id.menu_date));
    public static final List r = Arrays.asList(Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_quote));
    public final View a;
    public final w4 b;
    public Menu e;
    public final int i;
    public Runnable j;
    public lt k;
    public final f6 n;
    public final ng.a o;
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f = new ArrayList();
    public MenuItem.OnMenuItemClickListener g = p;
    public boolean h = true;
    public final l4 l = new l4(this);
    public final nh.e4 m = new nh.e4(4);

    public y4(Context context, View view, int i10, f6 f6Var, ng.a aVar) {
        this.a = view;
        this.i = i10;
        this.o = aVar;
        this.n = f6Var;
        this.b = new w4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i10, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i10);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static LinearLayout b(y4 y4Var, Context context, MenuItem menuItem, boolean z4, boolean z10, boolean z11) {
        int v02;
        f6 f6Var = y4Var.n;
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
        int v03 = j6.v0(j6.i6, f6Var);
        int i10 = y4Var.i;
        if (i10 == 0) {
            v02 = j6.v0(j6.j5, f6Var);
            textView.setTextColor(v02);
        } else if (i10 == 2) {
            v02 = -328966;
            textView.setTextColor(-328966);
            v03 = 553648127;
        } else if (i10 == 1) {
            v02 = j6.v0(j6.G6, f6Var);
            textView.setTextColor(v02);
        } else {
            v02 = j6.v0(j6.G6, f6Var);
        }
        if (z10 || z11) {
            linearLayout.setBackground(j6.a0(v03, z10 ? 12 : 0, z11 ? 12 : 0, z11 ? 12 : 0, z10 ? 12 : 0));
        } else {
            linearLayout.setBackground(j6.f0(v03, 2, -1));
        }
        textView.setPaddingRelative(AndroidUtilities.dp(11.0f), 0, 0, 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, AndroidUtilities.dp(z4 ? 42.0f : 48.0f)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_mini_lock3);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.l1(0.4f, v02), PorterDuff.Mode.SRC_IN));
        imageView.setVisibility(8);
        linearLayout.addView(imageView, k7.b6.p(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
            e(linearLayout, menuItem, y4Var.j != null);
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
        w4 w4Var = this.b;
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
        boolean z10 = w4Var.F;
        Rect rect = w4Var.A;
        y4 y4Var = w4Var.Q;
        if (!z10) {
            w4Var.G = false;
            w4Var.F = true;
            w4Var.x.cancel();
            w4Var.w.start();
            w4Var.D.setEmpty();
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.g;
        Size size2 = w4Var.H;
        w4Var.K = onMenuItemClickListener;
        w4Var.d();
        w4Var.I = null;
        w4Var.J = null;
        w4Var.N = false;
        w4Var.n();
        pb1 pb1Var = w4Var.g;
        pb1Var.removeAllViews();
        pb1Var.setPaddingRelative(0, 0, 0, 0);
        v4 v4Var = w4Var.h;
        ArrayAdapter arrayAdapter = (ArrayAdapter) v4Var.getAdapter();
        arrayAdapter.clear();
        v4Var.setAdapter((ListAdapter) arrayAdapter);
        w4Var.f.removeAllViews();
        w4Var.b.getWindowVisibleDisplayFrame(rect);
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
            if (menuItem3 == null || y4Var.j == null || !list3.contains(Integer.valueOf(menuItem3.getItemId()))) {
                int i13 = i12;
                list = list3;
                LinearLayout b10 = b(y4Var, w4Var.a, menuItem3, false, z11, z12);
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
                b10.setOnClickListener(w4Var.L);
                pb1Var.addView(b10);
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
            pb1Var.setPaddingRelative(0, 0, size2.getWidth(), 0);
        }
        pb1Var.measure(i10, i10);
        w4Var.J = new Size(pb1Var.getMeasuredWidth(), pb1Var.getMeasuredHeight());
        if (!linkedList.isEmpty()) {
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) v4Var.getAdapter();
            arrayAdapter2.clear();
            if (y4Var.j != null) {
                Collections.sort(linkedList, new nh.e4(5));
            }
            int size3 = linkedList.size();
            boolean premiumFeaturesBlocked = MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked();
            int i15 = 0;
            while (i15 < size3) {
                MenuItem menuItem4 = (MenuItem) linkedList.get(i15);
                if (y4Var.j == null) {
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
            v4Var.setAdapter((ListAdapter) arrayAdapter2);
            if (w4Var.M) {
                v4Var.setY(0.0f);
            } else {
                v4Var.setY(size2.getHeight());
            }
            int count = v4Var.getAdapter().getCount();
            int i16 = 0;
            for (int i17 = 0; i17 < count; i17++) {
                MenuItem menuItem5 = (MenuItem) v4Var.getAdapter().getItem(i17);
                com.google.firebase.messaging.n nVar = w4Var.q;
                LinearLayout linearLayout = (LinearLayout) nVar.d;
                e(linearLayout, menuItem5, ((w4) nVar.e).Q.j != null);
                linearLayout.measure(0, 0);
                i16 = Math.max(linearLayout.getMeasuredWidth(), i16);
            }
            Size size4 = new Size(Math.max(i16, size2.getWidth()), w4Var.c(4));
            w4Var.I = size4;
            w4.m(v4Var, size4);
        }
        w4Var.p();
        this.f = d;
        boolean f10 = w4Var.f();
        Point point = w4Var.B;
        PopupWindow popupWindow = w4Var.c;
        Rect rect2 = this.d;
        Rect rect3 = this.c;
        if (f10) {
            if (!rect2.equals(rect3) && w4Var.f() && popupWindow.isShowing()) {
                w4Var.d();
                w4Var.i(rect3);
                w4Var.h();
                popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
            }
        } else if (!w4Var.f()) {
            w4Var.G = false;
            w4Var.F = false;
            w4Var.w.cancel();
            w4Var.x.cancel();
            w4Var.d();
            w4Var.i(rect3);
            w4Var.h();
            popupWindow.showAtLocation(w4Var.b, 0, point.x, point.y);
            w4Var.v.start();
        }
        this.h = false;
        rect2.set(rect3);
    }

    public final ArrayList d(Menu menu) {
        lt ltVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; menu != null && i10 < menu.size(); i10++) {
            MenuItem item = menu.getItem(i10);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (ltVar = this.k) == null || ((Boolean) ltVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
