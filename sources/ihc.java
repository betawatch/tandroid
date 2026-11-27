// default package

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class ihc {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final vgc e = new vgc();
    public static final xgc f = new xgc();

    public static zic a(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            a = weakHashMap;
        }
        zic zicVar = (zic) weakHashMap.get(view);
        if (zicVar != null) {
            return zicVar;
        }
        zic zicVar2 = new zic(view);
        a.put(view, zicVar2);
        return zicVar2;
    }

    public static l2d b(View view, l2d l2dVar) {
        WindowInsets g = l2dVar.g();
        if (g != null) {
            WindowInsets a2 = Build.VERSION.SDK_INT >= 30 ? fhc.a(view, g) : ygc.a(view, g);
            if (!a2.equals(g)) {
                return l2d.h(view, a2);
            }
        }
        return l2dVar;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = hhc.d;
        hhc hhcVar = (hhc) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (hhcVar == null) {
            hhcVar = new hhc();
            hhcVar.a = null;
            hhcVar.b = null;
            hhcVar.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, hhcVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = hhcVar.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = hhc.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (hhcVar.a == null) {
                        hhcVar.a = new WeakHashMap();
                    }
                    for (int size = arrayList2.size() - 1; size >= 0; size--) {
                        ArrayList arrayList3 = hhc.d;
                        View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            hhcVar.a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                hhcVar.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a2 = hhcVar.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                SparseArray sparseArray = hhcVar.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    hhcVar.b = sparseArray;
                }
                sparseArray.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = hhc.d;
            hhc hhcVar = (hhc) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (hhcVar == null) {
                hhcVar = new hhc();
                hhcVar.a = null;
                hhcVar.b = null;
                hhcVar.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, hhcVar);
            }
            WeakReference weakReference2 = hhcVar.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                hhcVar.c = new WeakReference(keyEvent);
                SparseArray sparseArray = hhcVar.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    hhcVar.b = sparseArray;
                }
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    grb.o();
                    return false;
                }
            }
        }
        return false;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ehc.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static ArrayList f(im7 im7Var) {
        ArrayList arrayList = (ArrayList) im7Var.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        im7Var.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(ip ipVar) {
        return Build.VERSION.SDK_INT >= 31 ? ghc.a(ipVar) : (String[]) ipVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(int i, View view) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i2 >= 28) {
                tag = dhc.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    List<CharSequence> text = obtain.getText();
                    if (i2 >= 28) {
                        charSequence = dhc.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequence = tag2;
                        }
                    }
                    text.add(charSequence);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            List<CharSequence> text2 = obtain2.getText();
            if (i2 >= 28) {
                charSequence = dhc.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequence = tag3;
                }
            }
            text2.add(charSequence);
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static l2d i(View view, l2d l2dVar) {
        WindowInsets g = l2dVar.g();
        if (g != null) {
            WindowInsets b2 = ygc.b(view, g);
            if (!b2.equals(g)) {
                return l2d.h(view, b2);
            }
        }
        return l2dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static bw2 j(View view, bw2 bw2Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + bw2Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return ghc.b(view, bw2Var);
        }
        vmb vmbVar = (vmb) view.getTag(R.id.tag_on_receive_content_listener);
        fs7 fs7Var = e;
        if (vmbVar == null) {
            if (view instanceof fs7) {
                fs7Var = (fs7) view;
            }
            return fs7Var.a(bw2Var);
        }
        bw2 a2 = vmb.a(view, bw2Var);
        if (a2 == null) {
            return null;
        }
        if (view instanceof fs7) {
            fs7Var = (fs7) view;
        }
        return fs7Var.a(a2);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            ehc.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void l(View view, r4 r4Var) {
        if (r4Var == null && (e(view) instanceof q4)) {
            r4Var = new r4();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(r4Var == null ? null : r4Var.b);
    }

    public static void m(View view, CharSequence charSequence) {
        new wgc(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, (byte) 1).a(view, charSequence);
        xgc xgcVar = f;
        if (charSequence == null) {
            xgcVar.a.remove(view);
            view.removeOnAttachStateChangeListener(xgcVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(xgcVar);
        } else {
            xgcVar.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(xgcVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(xgcVar);
            }
        }
    }
}
