package org.chromium.support_lib_boundary;

import android.content.Context;
import android.webkit.WebView;
import j$.util.function.Consumer$-CC;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public interface WebViewBuilderBoundaryInterface {

    /* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    /* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
    public static class Config implements Consumer<BiConsumer<Integer, Object>> {
        public int baseline = 0;
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();
        public final ArrayList c = new ArrayList();

        public void addJavascriptInterface(Object obj, String str, List<String> list) {
            this.a.add(obj);
            this.b.add(str);
            this.c.add(list);
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$-CC.$default$andThen(this, consumer);
        }

        @Override // java.util.function.Consumer
        public void accept(BiConsumer<Integer, Object> biConsumer) {
            biConsumer.accept(0, Integer.valueOf(this.baseline));
            biConsumer.accept(1, new Object[]{this.a, this.b, this.c});
        }
    }

    /* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
    }

    WebView build(Context context, Consumer<BiConsumer<Integer, Object>> consumer);
}
