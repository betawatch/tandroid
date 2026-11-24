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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class kfc {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final xec d = new xec();
    public static final zec e = new zec();

    public static ahc a(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            a = weakHashMap;
        }
        ahc ahcVar = (ahc) weakHashMap.get(view);
        if (ahcVar != null) {
            return ahcVar;
        }
        ahc ahcVar2 = new ahc(view);
        a.put(view, ahcVar2);
        return ahcVar2;
    }

    public static wzc b(View view, wzc wzcVar) {
        WindowInsets g = wzcVar.g();
        if (g != null) {
            WindowInsets a2 = Build.VERSION.SDK_INT >= 30 ? hfc.a(view, g) : afc.a(view, g);
            if (!a2.equals(g)) {
                return wzc.h(view, a2);
            }
        }
        return wzcVar;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = jfc.d;
        jfc jfcVar = (jfc) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (jfcVar == null) {
            jfcVar = new jfc();
            jfcVar.a = null;
            jfcVar.b = null;
            jfcVar.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, jfcVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = jfcVar.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = jfc.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (jfcVar.a == null) {
                        jfcVar.a = new WeakHashMap();
                    }
                    for (int size = arrayList2.size() - 1; size >= 0; size--) {
                        ArrayList arrayList3 = jfc.d;
                        View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            jfcVar.a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                jfcVar.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a2 = jfcVar.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                SparseArray sparseArray = jfcVar.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    jfcVar.b = sparseArray;
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
            ArrayList arrayList2 = jfc.d;
            jfc jfcVar = (jfc) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (jfcVar == null) {
                jfcVar = new jfc();
                jfcVar.a = null;
                jfcVar.b = null;
                jfcVar.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, jfcVar);
            }
            WeakReference weakReference2 = jfcVar.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                jfcVar.c = new WeakReference(keyEvent);
                SparseArray sparseArray = jfcVar.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    jfcVar.b = sparseArray;
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
                    rjb.p();
                    return false;
                }
            }
        }
        return false;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return gfc.a(view);
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

    public static String[] f(hq hqVar) {
        return Build.VERSION.SDK_INT >= 31 ? ifc.a(hqVar) : (String[]) hqVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(int i, View view) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i2 >= 28) {
                tag = ffc.a(view);
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
                        charSequence = ffc.a(view);
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
                charSequence = ffc.a(view);
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

    public static wzc h(View view, wzc wzcVar) {
        WindowInsets g = wzcVar.g();
        if (g != null) {
            WindowInsets b2 = afc.b(view, g);
            if (!b2.equals(g)) {
                return wzc.h(view, b2);
            }
        }
        return wzcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rw2 i(View view, rw2 rw2Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + rw2Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return ifc.b(view, rw2Var);
        }
        alb albVar = (alb) view.getTag(R.id.tag_on_receive_content_listener);
        ir7 ir7Var = d;
        if (albVar == null) {
            if (view instanceof ir7) {
                ir7Var = (ir7) view;
            }
            return ir7Var.a(rw2Var);
        }
        rw2 a2 = alb.a(view, rw2Var);
        if (a2 == null) {
            return null;
        }
        if (view instanceof ir7) {
            ir7Var = (ir7) view;
        }
        return ir7Var.a(a2);
    }

    public static void j(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            gfc.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void k(View view, q4 q4Var) {
        if (q4Var == null && (e(view) instanceof p4)) {
            q4Var = new q4();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(q4Var == null ? null : q4Var.b);
    }

    public static void l(View view, CharSequence charSequence) {
        new yec(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, (byte) 1).a(view, charSequence);
        zec zecVar = e;
        if (charSequence == null) {
            zecVar.a.remove(view);
            view.removeOnAttachStateChangeListener(zecVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(zecVar);
        } else {
            zecVar.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(zecVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(zecVar);
            }
        }
    }
}
