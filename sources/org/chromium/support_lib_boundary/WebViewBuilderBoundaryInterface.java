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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public interface WebViewBuilderBoundaryInterface {

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
    }

    WebView build(Context context, Consumer<BiConsumer<Integer, Object>> consumer);
}
