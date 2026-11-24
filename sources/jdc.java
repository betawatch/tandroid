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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class jdc {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final wcc d = new wcc();
    public static final ycc e = new ycc();

    public static afc a(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            a = weakHashMap;
        }
        afc afcVar = (afc) weakHashMap.get(view);
        if (afcVar != null) {
            return afcVar;
        }
        afc afcVar2 = new afc(view);
        a.put(view, afcVar2);
        return afcVar2;
    }

    public static vxc b(View view, vxc vxcVar) {
        WindowInsets g = vxcVar.g();
        if (g != null) {
            WindowInsets a2 = Build.VERSION.SDK_INT >= 30 ? gdc.a(view, g) : zcc.a(view, g);
            if (!a2.equals(g)) {
                return vxc.h(view, a2);
            }
        }
        return vxcVar;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = idc.d;
        idc idcVar = (idc) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (idcVar == null) {
            idcVar = new idc();
            idcVar.a = null;
            idcVar.b = null;
            idcVar.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, idcVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = idcVar.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = idc.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (idcVar.a == null) {
                        idcVar.a = new WeakHashMap();
                    }
                    for (int size = arrayList2.size() - 1; size >= 0; size--) {
                        ArrayList arrayList3 = idc.d;
                        View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            idcVar.a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                idcVar.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a2 = idcVar.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                SparseArray sparseArray = idcVar.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    idcVar.b = sparseArray;
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
            ArrayList arrayList2 = idc.d;
            idc idcVar = (idc) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (idcVar == null) {
                idcVar = new idc();
                idcVar.a = null;
                idcVar.b = null;
                idcVar.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, idcVar);
            }
            WeakReference weakReference2 = idcVar.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                idcVar.c = new WeakReference(keyEvent);
                SparseArray sparseArray = idcVar.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    idcVar.b = sparseArray;
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
                    fyb.g();
                    return false;
                }
            }
        }
        return false;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return fdc.a(view);
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

    public static String[] f(hp hpVar) {
        return Build.VERSION.SDK_INT >= 31 ? hdc.a(hpVar) : (String[]) hpVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(int i, View view) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i2 >= 28) {
                tag = edc.a(view);
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
                        charSequence = edc.a(view);
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
                charSequence = edc.a(view);
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

    public static vxc h(View view, vxc vxcVar) {
        WindowInsets g = vxcVar.g();
        if (g != null) {
            WindowInsets b2 = zcc.b(view, g);
            if (!b2.equals(g)) {
                return vxc.h(view, b2);
            }
        }
        return vxcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static hv2 i(View view, hv2 hv2Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + hv2Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return hdc.b(view, hv2Var);
        }
        zib zibVar = (zib) view.getTag(R.id.tag_on_receive_content_listener);
        fp7 fp7Var = d;
        if (zibVar == null) {
            if (view instanceof fp7) {
                fp7Var = (fp7) view;
            }
            return fp7Var.a(hv2Var);
        }
        hv2 a2 = zib.a(view, hv2Var);
        if (a2 == null) {
            return null;
        }
        if (view instanceof fp7) {
            fp7Var = (fp7) view;
        }
        return fp7Var.a(a2);
    }

    public static void j(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            fdc.b(view, context, iArr, attributeSet, typedArray, i, 0);
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
        new xcc(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, (byte) 1).a(view, charSequence);
        ycc yccVar = e;
        if (charSequence == null) {
            yccVar.a.remove(view);
            view.removeOnAttachStateChangeListener(yccVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(yccVar);
        } else {
            yccVar.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(yccVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(yccVar);
            }
        }
    }
}
