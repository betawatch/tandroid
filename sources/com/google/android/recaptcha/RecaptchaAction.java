package com.google.android.recaptcha;

import a8.p0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class RecaptchaAction {
    public static final Companion Companion = new Companion(null);
    public static final RecaptchaAction LOGIN = new RecaptchaAction("login");
    public static final RecaptchaAction SIGNUP = new RecaptchaAction("signup");
    private final String action;

    /* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
    public static final class Companion {
        private Companion() {
        }

        public final RecaptchaAction custom(String str) {
            return new RecaptchaAction(str, null);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    private RecaptchaAction(String str) {
        this.action = str;
    }

    public static /* synthetic */ RecaptchaAction copy$default(RecaptchaAction recaptchaAction, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = recaptchaAction.action;
        }
        return recaptchaAction.copy(str);
    }

    public static final RecaptchaAction custom(String str) {
        return Companion.custom(str);
    }

    public final String component1() {
        return this.action;
    }

    public final RecaptchaAction copy(String str) {
        return new RecaptchaAction(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecaptchaAction) && j.a(this.action, ((RecaptchaAction) obj).action);
    }

    public final String getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public String toString() {
        return p0.s(new StringBuilder("RecaptchaAction(action="), this.action, ")");
    }

    public /* synthetic */ RecaptchaAction(String str, f fVar) {
        this(str);
    }
}
