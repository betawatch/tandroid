package androidx.car.app.model;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class TemplateWrapper {
    private int mCurrentTaskStep;
    private String mId;
    private boolean mIsRefresh;
    private x0 mTemplate;
    private List<TemplateInfo> mTemplateInfoForScreenStack;

    private TemplateWrapper(x0 x0Var, String str) {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = x0Var;
        this.mId = str;
    }

    public static TemplateWrapper copyOf(TemplateWrapper templateWrapper) {
        TemplateWrapper wrap = wrap(templateWrapper.getTemplate(), templateWrapper.getId());
        wrap.setRefresh(templateWrapper.isRefresh());
        wrap.setCurrentTaskStep(templateWrapper.getCurrentTaskStep());
        List<TemplateInfo> templateInfosForScreenStack = templateWrapper.getTemplateInfosForScreenStack();
        if (templateInfosForScreenStack != null) {
            wrap.setTemplateInfosForScreenStack(templateInfosForScreenStack);
        }
        return wrap;
    }

    private static String createRandomId() {
        return UUID.randomUUID().toString();
    }

    public static TemplateWrapper wrap(x0 x0Var) {
        return wrap(x0Var, createRandomId());
    }

    public int getCurrentTaskStep() {
        return this.mCurrentTaskStep;
    }

    public String getId() {
        String str = this.mId;
        Objects.requireNonNull(str);
        return str;
    }

    public x0 getTemplate() {
        x0 x0Var = this.mTemplate;
        Objects.requireNonNull(x0Var);
        return x0Var;
    }

    public List<TemplateInfo> getTemplateInfosForScreenStack() {
        List<TemplateInfo> list = this.mTemplateInfoForScreenStack;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public boolean isRefresh() {
        return this.mIsRefresh;
    }

    public void setCurrentTaskStep(int i9) {
        this.mCurrentTaskStep = i9;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setRefresh(boolean z10) {
        this.mIsRefresh = z10;
    }

    public void setTemplate(x0 x0Var) {
        this.mTemplate = x0Var;
    }

    public void setTemplateInfosForScreenStack(List<TemplateInfo> list) {
        this.mTemplateInfoForScreenStack = list;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[template: ");
        sb2.append(this.mTemplate);
        sb2.append(", ID: ");
        return aa.d.r(sb2, this.mId, "]");
    }

    public static TemplateWrapper wrap(x0 x0Var, String str) {
        Objects.requireNonNull(x0Var);
        Objects.requireNonNull(str);
        return new TemplateWrapper(x0Var, str);
    }

    private TemplateWrapper() {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = null;
        this.mId = "";
    }
}
