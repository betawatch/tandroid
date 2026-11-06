package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.iz;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class v extends FrameLayout {
    public static final HashSet b = new HashSet();
    public static boolean c = false;
    public final boolean a;

    public v(Context context) {
        super(context);
        this.a = iz.o() == 2;
    }

    public final void a(boolean z9) {
        c = false;
        if (z9) {
            setLayerType(0, null);
        }
        HashSet hashSet = b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (c) {
            b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (c) {
            b.add(this);
        } else {
            super.invalidate(i7, i10, i11, i12);
        }
    }
}
