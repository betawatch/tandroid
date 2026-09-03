package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class r1 extends ListView {
    public final Rect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public p1 h;
    public boolean n;
    public final boolean r;
    public boolean s;
    public u0.d v;
    public androidx.activity.i w;

    public r1(Context context, boolean z4) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.a = new Rect();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.r = z4;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i12 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i13 = 0;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            view.measure(i10, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i14 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i11) {
                return i11;
            }
        }
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r3 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i10, MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = true;
        if (actionMasked == 1) {
            z4 = false;
        } else if (actionMasked == 2) {
            z4 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i10);
        if (findPointerIndex >= 0) {
            int x10 = (int) motionEvent.getX(findPointerIndex);
            int y10 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x10, y10);
            if (pointToPosition != -1) {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f10 = x10;
                float f11 = y10;
                this.s = true;
                m1.a(this, f10, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i11 = this.f;
                if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f = pointToPosition;
                m1.a(childAt3, f10 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z12 = (selector == null || pointToPosition == -1) ? false : true;
                if (z12) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.a;
                rect.set(left, top, right, bottom);
                rect.left -= this.b;
                rect.top -= this.c;
                rect.right += this.d;
                rect.bottom += this.e;
                if (n0.a.a()) {
                    z10 = o1.a(this);
                } else {
                    Field field = q1.a;
                    if (field != null) {
                        try {
                            z10 = field.getBoolean(this);
                        } catch (IllegalAccessException e6) {
                            e6.printStackTrace();
                        }
                    }
                    z10 = false;
                }
                if (childAt3.isEnabled() != z10) {
                    boolean z13 = !z10;
                    if (n0.a.a()) {
                        o1.b(this, z13);
                    } else {
                        Field field2 = q1.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z13));
                            } catch (IllegalAccessException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z12) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f10, f11);
                }
                p1 p1Var = this.h;
                if (p1Var != null) {
                    p1Var.b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z11 = false;
                z4 = true;
            }
            if (z4 || z11) {
                this.s = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z4) {
                u0.d dVar = this.v;
                if (dVar != null) {
                    if (dVar.C) {
                        dVar.d();
                    }
                    dVar.C = false;
                }
            } else {
                if (this.v == null) {
                    this.v = new u0.d(this);
                }
                u0.d dVar2 = this.v;
                boolean z14 = dVar2.C;
                dVar2.C = true;
                dVar2.onTouch(this, motionEvent);
            }
            return z4;
        }
        z11 = false;
        z4 = false;
        if (z4) {
        }
        this.s = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z4) {
        }
        return z4;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.w != null) {
            return;
        }
        super.drawableStateChanged();
        p1 p1Var = this.h;
        if (p1Var != null) {
            p1Var.b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.s && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.r || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.r || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.r || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.r && this.n) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.w = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.w == null) {
            androidx.activity.i iVar = new androidx.activity.i(this, 28);
            this.w = iVar;
            post(iVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 < 30 || !n1.d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        n1.a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        n1.b.invoke(this, Integer.valueOf(pointToPosition));
                        n1.c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e6) {
                        e6.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.s && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.activity.i iVar = this.w;
        if (iVar != null) {
            r1 r1Var = (r1) iVar.b;
            r1Var.w = null;
            r1Var.removeCallbacks(iVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z4) {
        this.n = z4;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        p1 p1Var = null;
        if (drawable != null) {
            p1 p1Var2 = new p1();
            Drawable drawable2 = p1Var2.a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            p1Var2.a = drawable;
            drawable.setCallback(p1Var2);
            p1Var2.b = true;
            p1Var = p1Var2;
        }
        this.h = p1Var;
        super.setSelector(p1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.b = rect.left;
        this.c = rect.top;
        this.d = rect.right;
        this.e = rect.bottom;
    }
}
